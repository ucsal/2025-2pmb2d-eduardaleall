package br.com.mariojp.solid.dip;

public interface Noop implements MailSender {
    public void send(String to, String subject, String body);
}
