package hudson.plugins.memegen;

import hudson.Plugin;
import java.util.logging.Logger;

public class PluginImpl extends Plugin {
    private final static Logger LOG = Logger.getLogger(PluginImpl.class.getName());
 
    public void start() throws Exception {
        LOG.info("starting memegen plugin");
    }
}