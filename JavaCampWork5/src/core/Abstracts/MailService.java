package core.Abstracts;

import entities.concretes.User;

public interface MailService {
void sendVerificationMail(User user);
void verifyUser(User user);

}
