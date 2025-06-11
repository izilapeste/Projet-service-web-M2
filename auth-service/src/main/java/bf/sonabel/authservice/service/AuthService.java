package bf.sonabel.authservice.service;

import bf.sonabel.authservice.dtos.AuthRequest;
import bf.sonabel.authservice.dtos.AuthResponse;
import bf.sonabel.authservice.dtos.RegisterRequest;
import bf.sonabel.authservice.security.JwtUtil;
import com.sonabel.sharedmodels.entites.Client;
import com.sonabel.sharedmodels.repositories.ClientRepository;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class AuthService {


    private final  ClientRepository clientRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthService(ClientRepository clientRepository, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.clientRepository = clientRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public AuthResponse register(RegisterRequest request) {
        Client user = new Client();
        user.setUsername(request.username());
        user.setPassword(passwordEncoder.encode(request.password()));
        user.setNom(request.nom());
        user.setMail(request.mail());
        user.setNumTelephone(request.numTelephone());
        clientRepository.save(user);
        return new AuthResponse(jwtUtil.generateToken(user.getUsername()));
    }

    public AuthResponse login(AuthRequest request) {
        Client user = clientRepository.findByUsername(request.username())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        if (!passwordEncoder.matches(request.password(), user.getPassword())) {
            throw new BadCredentialsException("Invalid password");
        }
        return new AuthResponse(jwtUtil.generateToken(user.getUsername()));
    }
}
