$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/UIandAPIWeatherDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Weather details test",
  "description": "",
  "id": "weather-details-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get weather details from UI",
  "description": "",
  "id": "weather-details-test;get-weather-details-from-ui",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on weather link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user verify the weather details",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "UIWeatherDetails.user_is_on_home_page()"
});
formatter.result({
  "duration": 6693485799,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Failed to create Chrome process.\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027L-2X1G882-0\u0027, ip: \u002710.34.198.169\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00C09563+2725219]\n\tOrdinal0 [0x00B08551+1672529]\n\tOrdinal0 [0x009F0359+525145]\n\tOrdinal0 [0x0097D4FC+54524]\n\tOrdinal0 [0x0099CC37+183351]\n\tOrdinal0 [0x0099CA3D+182845]\n\tOrdinal0 [0x0099A94B+174411]\n\tOrdinal0 [0x00982528+75048]\n\tOrdinal0 [0x009835A0+79264]\n\tOrdinal0 [0x00983539+79161]\n\tOrdinal0 [0x00B1D607+1758727]\n\tGetHandleVerifier [0x00D26546+1050150]\n\tGetHandleVerifier [0x00D26291+1049457]\n\tGetHandleVerifier [0x00D310D7+1094071]\n\tGetHandleVerifier [0x00D26B46+1051686]\n\tOrdinal0 [0x00B15B06+1727238]\n\tOrdinal0 [0x00B1EB7B+1764219]\n\tOrdinal0 [0x00B1ECE3+1764579]\n\tOrdinal0 [0x00B34C05+1854469]\n\tBaseThreadInitThunk [0x75276359+25]\n\tRtlGetAppContainerNamedObjectPath [0x77687C24+228]\n\tRtlGetAppContainerNamedObjectPath [0x77687BF4+180]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat stepDefinations.UIWeatherDetails.user_is_on_home_page(UIWeatherDetails.java:38)\r\n\tat ✽.Given user is on home page(./Features/UIandAPIWeatherDetails.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UIWeatherDetails.user_clicks_on_weather_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UIWeatherDetails.user_verify_the_weather_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UIWeatherDetails.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 9,
  "name": "Get weather details from API",
  "description": "",
  "id": "weather-details-test;get-weather-details-from-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User Set GET weather details api endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Send PUT request",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "verify response body",
  "keyword": "Then "
});
formatter.match({
  "location": "UIWeatherDetails.user_Set_GET_weather_details_api_endpoint()"
});
formatter.result({
  "duration": 13401901,
  "status": "passed"
});
formatter.match({
  "location": "UIWeatherDetails.send_PUT_request()"
});
formatter.result({
  "duration": 3506810299,
  "status": "passed"
});
formatter.match({
  "location": "UIWeatherDetails.verify_response_body()"
});
formatter.result({
  "duration": 646956200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Compare both UI and API data",
  "description": "",
  "id": "weather-details-test;compare-both-ui-and-api-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "USer complare both UI and API weather response",
  "keyword": "When "
});
formatter.match({
  "location": "UIWeatherDetails.USer_complare_both_UI_and_API_weather_response()"
});
formatter.result({
  "duration": 327399,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinations.UIWeatherDetails.USer_complare_both_UI_and_API_weather_response(UIWeatherDetails.java:85)\r\n\tat ✽.When USer complare both UI and API weather response(./Features/UIandAPIWeatherDetails.feature:15)\r\n",
  "status": "failed"
});
});