package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8881);

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br  = new BufferedReader(isr);
        int read;
        while ((read = br.read())!=-1){
            System.out.println((char)read);
        }

        is.close();
        ss.close();



    }
}
