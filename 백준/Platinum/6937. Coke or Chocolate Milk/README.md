# [Platinum II] Coke or Chocolate Milk - 6937

[문제 링크](https://www.acmicpc.net/problem/6937)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 4, 맞힌 사람: 3, 정답 비율: 10.000%

### 분류

그래프 이론, 문자열, 파싱, 강한 연결 요소, 역추적, 2-sat

### 문제 설명

<p>Anybody who has been to a child&#39;s birthday has seen the following scenario:</p>

<blockquote>
<p>Parent: OK Kids, what do you want to drink, Coke or Chocolate Milk?</p>

<p>Jamie: Coke</p>

<p>John: I hate Coke</p>

<p>Mary: I want what John is having</p>

<p>Barry: Ick! Then I don&#39;t want it if she&#39;s going to have it</p>

<p>&hellip; etc.</p>
</blockquote>

<p>This is a large party. 1000 people have been invited and nearly that number may show up. Can you make everybody happy?</p>

### 입력

<p>The input may contain several test cases. The first line of each test case is an integer $N$, the number of requests that must be satisfied. Following this line are the $N$ requests, each on its own line. Each request has one of these formats:</p>

<pre>
&lt;person&gt; wants &lt;drink&gt;
&lt;person&gt; hates &lt;drink&gt;
&lt;person&gt; wants same as &lt;person&gt;
&lt;person&gt; wants different from &lt;person&gt;
&lt;person&gt; wants &lt;drink&gt; if &lt;person&gt; gets &lt;drink&gt;</pre>

<p><code>&lt;person&gt;</code> is the name of a person - up to 20 lower-case letters. <code>&lt;drink&gt;</code> is either <code>Coke</code> or <code>chocolate milk</code>.</p>

<p>If it is possible to make everybody happy, print one line per person, in alphabetical order, with the format:</p>

<pre>
&lt;person&gt; gets &lt;drink&gt;</pre>

<p>If there is more than one way to make everybody happy (fat chance!), fill their glasses in alphabetical order and pour Coke (it&#39;s cheaper) whenever there is a choice. If it is not possible to make everybody happy, print:</p>

<pre>
Everybody gets water</pre>

### 출력

<p>Output a blank line after each test case. The input ends with 0 for the value of $N$.</p>