/*
 * Copyright 2019 Abdulla Abdurakhmanov (abdulla@latestbit.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package org.latestbit.slack.morphism.client.reqresp.views

import org.latestbit.slack.morphism.views.{ SlackStatefulView, SlackView }

/**
 * Request of https://api.slack.com/methods/views.update
 */
case class SlackApiViewsUpdateRequest(
    view: SlackView,
    external_id: Option[String] = None,
    hash: Option[String] = None,
    view_id: Option[String] = None
)

/**
 * Response of https://api.slack.com/methods/views.update
 */
case class SlackApiViewsUpdateResponse( view: SlackStatefulView )
