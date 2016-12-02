package ca.fuwafuwa.kaku.XmlParsers.KanjiDict2.Kd2DTO;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

import ca.fuwafuwa.kaku.XmlParsers.KanjiDict2.Kd2Consts;

/**
 * Created by 0x1bad1d3a on 12/1/2016.
 */
public class Kd2ReadingMeaning {

    private static final String XMLTAG = Kd2Consts.READING_MEANING;

    public Kd2ReadingMeaning(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, XMLTAG);
        parser.nextToken();

        while (!XMLTAG.equals(parser.getName())){
            String name = parser.getName() == null ? "" : parser.getName();
            switch(name){
            }
            parser.nextToken();
        }

        parser.require(XmlPullParser.END_TAG, null, XMLTAG);
    }
}