/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createdocumnentfile;

/**
 *
 * @author RSM
 */
public class DocumentFactory {
    DocumentFile df;
    public static DocumentFile getDocumnentFile( int filetype)
    {
        if (filetype == 1)
        {
            return new WordFile();
        }
        else if (filetype == 2)
        {
            return new TextFile();
        }
        else if (filetype == 3)
        {
            
            return new ExcleFile();
        }
        else if (filetype == 4)
        {
            return new PdfFile();
        }
        return null;
    }
}
