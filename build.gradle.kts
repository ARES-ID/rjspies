plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.orgJetbrainsCompose) apply false
    alias(libs.plugins.orgJetbrainsKotlinPluginCompose) apply false
    alias(libs.plugins.orgJetbrainsKotlinMultiplatform) apply false
    alias(libs.plugins.ioGitlabArturboschDetekt) apply false
    alias(libs.plugins.comDiffplugSpotless) apply false
}
