/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.vertx.java.deploy.impl;

import org.vertx.java.core.json.JsonObject;
import org.vertx.java.deploy.VerticleFactory;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
class Deployment {
  final String name;
  final String modName;
  final int instances;
  final VerticleFactory factory;
  final JsonObject config;
  final URL[] urls;
  final File modDir;
  final List<VerticleHolder> verticles = new ArrayList<>();
  final List<String> childDeployments = new ArrayList<>();
  final String parentDeploymentName;

  Deployment(String name, String modName, int instances, VerticleFactory factory, JsonObject config,
             URL[] urls, File modDir, String parentDeploymentName) {
    this.name = name;
    this.modName = modName;
    this.instances = instances;
    this.factory = factory;
    this.config = config;
    this.urls = urls;
    this.modDir = modDir;
    this.parentDeploymentName = parentDeploymentName;
  }
}
