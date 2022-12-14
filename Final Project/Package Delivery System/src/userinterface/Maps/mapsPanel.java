/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Maps;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.CardLayout;
import userinterface.BPOenterprise.bpoAdminPanel;
import userinterface.customer.customerCart;
import java.sql.*;

/**
 *
 * @author mahith
 */
public class mapsPanel extends javax.swing.JPanel {
    Connection connection;
    /**
     * Creates new form mapsPanel
     */
    Browser browser;
    public mapsPanel(Connection connection) {
        this.connection = connection;
        initComponents();
        
        loadMaps();
        
        //loadMarkedMaps();
        
//        EngineOptions options =
//                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDHFSC1G4NNJSWIB7FX6CBOWWCX8MKR14WNT2DH9XV6YW9EOWTXHCOQSIKV88D6J65JS").build();
//        Engine engine = Engine.newInstance(options);
//        browser = engine.newBrowser();
//        BrowserView view = BrowserView.newInstance(browser);
        
        
//        String first = "var locations = [\n";
//        String second = "['Booking 1', -33.890542, 151.274856, 4],\n['Booking 2', -33.923036, 151.259052, 5]\n";
//        String third = "];\n";
//        String fourth = "var marker, i;\n\nfor (i = 0; i < locations.length; i++) {  \n  marker = new google.maps.Marker({\n\tposition: new google.maps.LatLng(locations[i][1], locations[i][2]),\n\tmap: map,\n\tlabel: locations[i][0]\n });\n}\n\tbounds.extend(marker.position);";
//        
//        String setMarkerScript = first+second+third+fourth;
//        //setMarkers.addActionListener(e -> browser.mainFrame().ifPresent(frame -> frame.executeJavaScript(setMarkerScript)));
//        mapsArea.add(view);
//        
//        String rootPath = System.getProperty("user.dir");
//        browser.navigation().loadUrl(rootPath+"/simple_map.html/");
//        
//        mapsArea.add(view);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSetLocation = new javax.swing.JButton();
        mapsArea = new javax.swing.JPanel();

        btnSetLocation.setText("Set Location");
        btnSetLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetLocationActionPerformed(evt);
            }
        });

        mapsArea.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(btnSetLocation)
                .addContainerGap(493, Short.MAX_VALUE))
            .addComponent(mapsArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnSetLocation)
                .addGap(17, 17, 17)
                .addComponent(mapsArea, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetLocationActionPerformed
        // TODO add your handling code here:
        
                String[] split1= browser.url().split("/place/");
                String[] split2 = split1[1].split("/@");
                String[] placeName = split2[0].split("\\+");
                String[] longLat = split2[1].split(",");
                String[] zoom = longLat[2].split("z");
                int zoomer = Integer.valueOf(zoom[0]);
                String place="";
                
                int size = placeName.length;
                for(int i=0;i<size;i++){
                    place+=placeName[i]+" ";
                }
                
                customerCart cart = new customerCart(connection,longLat[0],longLat[1],place,zoomer);
                this.getParent().add("customer Cart",cart);
                CardLayout layout = (CardLayout) this.getParent().getLayout();
                layout.next(this.getParent());
                
                
                
                System.out.println(place+" Long is "+longLat[0]+" & Lat is"+ longLat[1]+" zoom"+zoomer);
    }//GEN-LAST:event_btnSetLocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSetLocation;
    private javax.swing.JPanel mapsArea;
    // End of variables declaration//GEN-END:variables

    public void loadMaps(){
        
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDHFSC1G4NNJSWIB7FX6CBOWWCX8MKR14WNT2DH9XV6YW9EOWTXHCOQSIKV88D6J65JS").build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
        browser.navigation().loadUrl("https://www.google.com/maps");
        
        mapsArea.add(view,"a");
        
    }
    
    public void loadMarkedMaps(){
        
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDHFSC1G4NNJSWIB7FX6CBOWWCX8MKR14WNT2DH9XV6YW9EOWTXHCOQSIKV88D6J65JS").build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
//      browser.navigation().loadUrl("https://www.google.com/maps");

         browser.navigation().loadUrl("D:\\AED Project\\AED_FinalProject_MAM\\Google Maps\\index.html");
         
        String first = "var locations = [\n";
        String second = "['Booking 1', -33.890542, 151.274856, 4],\n['Booking 2', -33.923036, 151.259052, 5]\n";
        String third = "];\n";
        String fourth = "var i;\n\nfor (i = 0; i < locations.length; i++) {  \n var marker = new google.maps.Marker({\n\tposition: new google.maps.LatLng(locations[i][1], locations[i][2]),\n\tmap: map,\n\tlabel: locations[i][0]\n });\n}\n\tbounds.extend(marker.position);";
        String fifth = "\nmap.fitBounds(bounds)";
        String setMarkerScript = first+second+third+fourth+fifth;        
        
        
        //setMarkers.addActionListener(e -> browser.mainFrame().ifPresent(frame -> frame.executeJavaScript(setMarkerScript)));
        
        mapsArea.add(view);
        
        String rootPath = System.getProperty("user.dir");
        browser.navigation().loadUrl(rootPath+"/simple_map.html/");
        browser.navigation().loadUrl("D:\\AED Project\\AED_FinalProject_MAM\\Google Maps\\index.html");

        mapsArea.add(view);
        
    }



}
