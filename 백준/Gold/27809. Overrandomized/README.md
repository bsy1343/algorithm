# [Gold IV] Overrandomized - 27809

[문제 링크](https://www.acmicpc.net/problem/27809)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 20, 맞힌 사람: 16, 정답 비율: 32.653%

### 분류

수학, 확률론, 통계학

### 문제 설명

<p><i>Note:</i> Every time this statement says something is randomly chosen, it means &quot;chosen uniformly at random across all valid possibilities, and independently from all other choices&quot;.</p>

<p>The company Banana Rocks Inc. just wrote a premium cloud-based random number generation service that is destined to be the new gold standard of randomness.</p>

<p>The original design was that a group of servers would receive a request in the form of a single positive integer M of up to <b>U</b> decimal digits and then respond with an integer from the range 1 through M, inclusive, chosen at random. However, instead of simply having the output written with digits 0 through 9 as usual, the servers were &quot;overrandomized&quot;. Each server has a random subset of 10 distinct uppercase English letters to use as digits, and a random mapping from those letters to unique values between 0 and 9.</p>

<p>The formal description of the current situation is as follows: each server has a <i>digit string</i> D composed of exactly 10 different uppercase English letters. The digit string defines the mapping between letters and the base 10 digits: D&#39;s j-th character from the left (counting from 0) is the base 10 digit of value j. For example, if D were <code>CODEJAMFUN</code> then <code>C</code> would represent digit 0, <code>O</code> would represent digit 1 and <code>N</code> would represent digit 9. The number 379009 would be encoded as <code>EFNCCN</code> when using that digit string.</p>

<p>When receiving the i-th query with an integer parameter M<sub>i</sub>, the server:</p>

<ul>
	<li>chooses an integer N<sub>i</sub> at random from the inclusive range 1 through M<sub>i</sub>,</li>
	<li>writes it as a base 10 string with no leading zeroes using the j-th character of D (counting starting from 0) as the digit of value j, and</li>
	<li>returns the resulting string as the response <b>R<sub>i</sub></b>.</li>
</ul>

<p>We collected some data that we believe we can use to recover the secret digit string D from each server. We sent 10<sup>4</sup> queries to each server. For each query, we chose a value M<sub>i</sub> at random from the range 1 through 10<sup><b>U</b></sup> - 1, inclusive, and received the response <b>R<sub>i</sub></b>, a string of up to <b>U</b> uppercase English letters. We recorded the pairs (M<sub>i</sub>, <b>R<sub>i</sub></b>). As we were moving these records to a new data storage device, the values of all the integers M<sub>i</sub> within the records of some servers became corrupted and unreadable.</p>

<p>Can you help us find each server&#39;s digit string D?</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each test case contains the records for one server and starts with a line containing a single integer <b>U</b>, representing that 10<sup><b>U</b></sup> - 1 is the inclusive upper bound for the range in which we chose the integers M<sub>i</sub> to query that server. Then, exactly 10<sup>4</sup> lines follow. Each of these lines contains an integer <b>Q<sub>i</sub></b> (in base 10 using digits 0 through 9, as usual) and a string <b>R<sub>i</sub></b>, representing the i-th query and response, respectively. If <b>Q<sub>i</sub></b> = -1, then the integer M<sub>i</sub> used for the i-th query is unknown. Otherwise, <b>Q<sub>i</sub></b> = M<sub>i</sub>.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is the digit string D for the server examined in test case <code>x</code>.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 10.</li>
	<li>D is a string of exactly 10 different uppercase English letters, chosen independently and uniformly at random from the set of all such strings.</li>
	<li>M<sub>i</sub> is chosen independently and uniformly at random from the range 1 through 10<sup><b>U</b></sup> - 1, inclusive, for all i.</li>
	<li>N<sub>i</sub> is chosen independently and uniformly at random from the range 1 through M<sub>i</sub>, inclusive, for all i.</li>
	<li><b>R<sub>i</sub></b> is the base 10 representation of N<sub>i</sub>, using the j-th digit from the left of D (counting starting from 0) as the digit of value j, for all i.</li>
</ul>