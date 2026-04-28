# [Gold I] Weather Forecasting - 7011

[문제 링크](https://www.acmicpc.net/problem/7011)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

구현, 문자열, 많은 조건 분기, 파싱

### 문제 설명

<p>Due to the gargantuan number of internet news sources, it&rsquo;s time-consuming to figure out who you can trust when it comes to forecasting the weather. So in order to weed out the worst offenders, you&rsquo;d like to build a simple model to automate this task. In particular, the model will take as input an agency&rsquo;s forecasts of today&rsquo;s weather from the previous four days. The output will be whether those forecasts correctly discerned if travelers would be impacted by the weather. For simplicity, let&rsquo;s assume you&rsquo;re only interested in days where the weather in fact caused problems.</p>

<p>For our purposes, a forecast will be one or more sentences from a prior day which are referring to today&rsquo;s weather. Each sentence will contain one phenomenon and zero or one qualifiers. In and of themselves, phenomena are either good, ambiguous, or bad, as follows:</p>

<table class="table" style="width:40%">
	<thead>
		<tr>
			<th>good</th>
			<th>ambiguous</th>
			<th>bad</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>sun</td>
			<td>high</td>
			<td>snow</td>
		</tr>
		<tr>
			<td>sunny</td>
			<td>highs</td>
			<td>snow showers</td>
		</tr>
		<tr>
			<td>clouds</td>
			<td>low</td>
			<td>flurries</td>
		</tr>
		<tr>
			<td>cloudy</td>
			<td>lows</td>
			<td>hail</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>wind</td>
			<td>rain</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>winds</td>
			<td>precipitation</td>
		</tr>
	</tbody>
</table>

<p>We assume that the sentence is, by default, indicating a 100% chance of the phenomenon. However, if a qualifier is present, it modifies this chance. For good and bad phenomena, the set of qualifiers and the chances they imply are as follows:</p>

<table class="table" style="width:40%">
	<tbody>
		<tr>
			<td>mostly</td>
			<td>80%</td>
		</tr>
		<tr>
			<td>some</td>
			<td>70%</td>
		</tr>
		<tr>
			<td>possible</td>
			<td>50%</td>
		</tr>
	</tbody>
</table>

<p>For ambiguous phenomena, exactly one qualifier will always be present. In particular, this qualifier will be numeric, and depending on its value, will determine whether an otherwise ambiguous phenomenon is in fact good or bad. The qualifier for high(s) and low(s) will take two forms: an integer between 0 and 80, or a range followed by an integer rounded to the nearest 10 degrees, where the range is one of &lsquo;upper&rsquo;, &lsquo;lower&rsquo;, and &lsquo;mid&rsquo;, e.g. &ldquo;upper 40s&rdquo;. A high is a good thing if the temperature is at least 60. A low is a good thing if the temperature is at least 50.</p>

<p>For wind(s), there is only one format, consisting of two integers and the words &ldquo;to&rdquo; and &ldquo;mph&rdquo;, e.g. &ldquo;5 to 10 mph&rdquo;. If the second integer is at least 25, the phenomenon is bad, otherwise it is good.</p>

<p>The score of a sentence is simply the chance of the phenomenon, but positive if it&rsquo;s good and negative if bad. The score of a forecast will be the average score of the forecast&rsquo;s sentences.</p>

<p>Let&rsquo;s also assume the forecasts get more accurate as the day they&rsquo;re referring to approaches. So in computing a total score for an agency&rsquo;s four forecasts, we&rsquo;ll weight each forecast by 1/(d+1) where d is the number of days the forecast was made in advance. So a forecast made yesterday for today&rsquo;s weather will have weight 1/2. Then we simply sum these weighted scores.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each exactly four lines. Line i of a data set contains the weather forecast i days before the day in question.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output &ldquo;YES&rdquo; if the total score is less than 0.25, meaning the news agency correctly forecast bad weather, otherwise output &ldquo;NO&rdquo;. Each data set should be followed by a blank line.</p>