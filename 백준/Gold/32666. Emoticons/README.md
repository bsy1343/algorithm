# [Gold III] Emoticons - 32666

[문제 링크](https://www.acmicpc.net/problem/32666)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 70, 정답: 15, 맞힌 사람: 12, 정답 비율: 21.429%

### 분류

문자열, 브루트포스 알고리즘, 스택, 자료 구조, 트라이, 트리

### 문제 설명

<p>Emma is a college student who regularly posts messages on her favorite social media, which supports several emoticons--- a pictorial representation of a facial expression using characters.</p>

<p>One day, she noticed that some emoticons in her message were automatically converted to the corresponding emojis by the platform.</p>

<p>For example, if she sends a message "<code>Hello ;-)</code>" to the platform, the actual post will be "<code>Hello </code><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32666.%E2%80%85Emoticons/8207d50b.png" data-original-src="https://boja.mercury.kr/assets/problem/32666-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc">".</p>

<p>If two or more emoticons overlap in a message, the system always converts the leftmost emoticon first.</p>

<p>Here is the complete list of the supported emoticons on that social media.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Type</th>
			<th>Emoticon</th>
			<th>Emoji</th>
			<th>Meaning</th>
		</tr>
		<tr>
			<td>Western</td>
			<td><code>:)</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32666.%E2%80%85Emoticons/68444133.png" data-original-src="https://boja.mercury.kr/assets/problem/32666-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></td>
			<td>Smiley</td>
		</tr>
		<tr>
			<td>Western</td>
			<td><code>:-)</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32666.%E2%80%85Emoticons/68444133.png" data-original-src="https://boja.mercury.kr/assets/problem/32666-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></td>
			<td>Smiley</td>
		</tr>
		<tr>
			<td>Western</td>
			<td><code>:-(</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32666.%E2%80%85Emoticons/2ae2d207.png" data-original-src="https://boja.mercury.kr/assets/problem/32666-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></td>
			<td>Frown</td>
		</tr>
		<tr>
			<td>Western</td>
			<td><code>;-)</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32666.%E2%80%85Emoticons/8207d50b.png" data-original-src="https://boja.mercury.kr/assets/problem/32666-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></td>
			<td>Wink</td>
		</tr>
		<tr>
			<td>Western</td>
			<td><code>xD</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32666.%E2%80%85Emoticons/a3345375.png" data-original-src="https://boja.mercury.kr/assets/problem/32666-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></td>
			<td>Laughing</td>
		</tr>
		<tr>
			<td>Eastern</td>
			<td><code>^_^</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32666.%E2%80%85Emoticons/68444133.png" data-original-src="https://boja.mercury.kr/assets/problem/32666-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></td>
			<td>Smiley</td>
		</tr>
		<tr>
			<td>Eastern</td>
			<td><code>-_-</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32666.%E2%80%85Emoticons/f307d5d0.png" data-original-src="https://boja.mercury.kr/assets/problem/32666-5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></td>
			<td>Expressionless</td>
		</tr>
		<tr>
			<td>Eastern</td>
			<td><code>^o^</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32666.%E2%80%85Emoticons/f69d660a.png" data-original-src="https://boja.mercury.kr/assets/problem/32666-6.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></td>
			<td>Screwed</td>
		</tr>
		<tr>
			<td>Eastern</td>
			<td><code>^^;</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32666.%E2%80%85Emoticons/43c83a23.png" data-original-src="https://boja.mercury.kr/assets/problem/32666-7.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></td>
			<td>Sweating</td>
		</tr>
		<tr>
			<td>Eastern</td>
			<td><code>(..)</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32666.%E2%80%85Emoticons/a09e7dbd.png" data-original-src="https://boja.mercury.kr/assets/problem/32666-8.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></td>
			<td>Looking down</td>
		</tr>
	</tbody>
</table>

<p>She always uses the following "visible" characters and the space character "<code> </code>".</p>

<ul>
	<li>Digits: <code>0123456789</code></li>
	<li>Uppercase letters: <code>ABCDEFGHIJKLMNOPQRSTUVWXYZ</code></li>
	<li>Lowercase letters: <code>abcdefghijklmnopqrstuvwxyz</code></li>
	<li>Symbols: <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_'{|}~</code></li>
</ul>

<p>Today, just before posting, she accidentally replaced all occurrences of one character in her message with another character.</p>

<p>Such characters include space, and she might have replaced a character with the same character, causing no effect.</p>

<p>Now, she wants to know the message length after the platform converts emoticons into emojis, where she counts each emoji as one character.</p>

<p>Can you help her find the minimum and maximum possible message lengths?</p>

### 입력

<p>The input contains Emma's original text (before she accidentally replaced characters) on one line. The text contains at most $100$ characters, consisting of the visible ASCII characters defined above and the space character.</p>

<p>Her text is not empty, and its first and last characters are visible characters.</p>

### 출력

<p>Output two integers, the minimum and the maximum possible message lengths after emoticons in her message are converted into emojis.</p>