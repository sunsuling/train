import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;







import java.util.UUID;


import org.codehaus.jackson.node.ObjectNode;

import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.Play;
import play.api.templates.Html;
import play.cache.Cache;
import play.libs.Json;
import play.mvc.Action;
import play.mvc.Http.Context;
import play.mvc.Http.Cookie;
import play.mvc.Http.Request;
import play.mvc.Http.RequestHeader;
import play.mvc.Result;
import play.mvc.Results;

import utils.ValueHelper;
import bean.UserSession;





public class Global extends GlobalSettings {

	@Override
	public void onStart(Application app) {
		 
		Logger.info("tran Application started...");
    }


	@Override
	public void onStop(Application app) {
//		if(SmsCilentHelper._channel.isConnected()){
//			SmsCilentHelper._channel.stop();
//		}
	}
}
