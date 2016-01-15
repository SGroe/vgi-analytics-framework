/** Copyright 2016, Simon Gröchenig, Salzburg Research Forschungsgesellschaft m.b.H.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package at.salzburgresearch.vgi.vgianalyticsframework.osm.vgi.service.impl;

import at.salzburgresearch.vgi.vgianalyticsframework.activityanalysis.model.vgi.IVgiModelFactory;

public abstract class AbstractVgiOperationOsmGenerator {
	
	protected IVgiModelFactory operationFactory;

	public AbstractVgiOperationOsmGenerator() {}
	
	public AbstractVgiOperationOsmGenerator(IVgiModelFactory operationFactory) {
		this.operationFactory = operationFactory;
	}
	
	public IVgiModelFactory getOperationFactory() {
		return operationFactory;
	}
	public void setOperationFactory(IVgiModelFactory operationFactory) {
		this.operationFactory = operationFactory;
	}
}
