# [Gold I] Foreign Postcards - 13994

[문제 링크](https://www.acmicpc.net/problem/13994)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 58, 맞힌 사람: 46, 정답 비율: 75.410%

### 분류

다이나믹 프로그래밍, 수학, 누적 합, 확률론

### 문제 설명

<p>Fedor is an avid traveler. As a result of his hobby, he has gathered a big collection of postcards from all over the world. Each postcard has a unique picture on the front side and some fields for address information and text on the back side.</p>

<p>During one of the parties at Fedor&rsquo;s house, he decided to show all his of postcards to the guests. To achieve that, he wants to lay them all out on the table. Initially, all of his postcards are arranged in a single stack that Fedor is holding in his hands. Unfortunately, some of the postcards in that stack can be turned incorrectly &mdash; upside down. Ideally, Fedor would like all postcards on the table to lie with the picture on top, but looking at every postcard and turning it over individually can be very time-consuming. Instead, he came up with the following process:</p>

<ol>
	<li>Let n be the number of postcards remaining in the stack in his hands. Fedor chooses a random number k uniformly between 1 and n and takes top k postcards from the stack.</li>
	<li>He looks at the topmost postcard among these k postcards. If it is oriented in the wrong way, he turns the whole stack of k postcards upside down together.</li>
	<li>He then puts these k postcards on the table without any further rotations.</li>
	<li>If there are still some postcards remaining in the stack in his hands, Fedor goes back to step 1.</li>
</ol>

<p>Of course, after all the postcards are on the table, there might still be some that lie back side up. What is the expected number of such postcards?</p>

### 입력

<p>The input consists of a single line of &ldquo;C&rdquo; and &ldquo;W&rdquo; characters &mdash; i-th character corresponds to i-th postcard in the stack, counting from the top of the stack. &ldquo;C&rdquo; means that i-th postcard is oriented correctly in the initial stack, and &ldquo;W&rdquo; means that i-th postcard is oriented in the wrong way. The number of characters is between 1 and 10<sup>6</sup> inclusive.</p>

### 출력

<p>Output one real number &mdash; the expected number of incorrectly placed postcards on the table. The absolute or relative error should not exceed 10<sup>&minus;9</sup> .</p>