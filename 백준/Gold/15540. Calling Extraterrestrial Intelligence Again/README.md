# [Gold V] Calling Extraterrestrial Intelligence Again - 15540

[문제 링크](https://www.acmicpc.net/problem/15540)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 24, 맞힌 사람: 24, 정답 비율: 80.000%

### 분류

수학, 브루트포스 알고리즘, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>A message from humans to extraterrestrial inteIigence was sent through the Arecibo radio telescope in Puerto Rico on the afternoon of Saturday November l6, l974. The message consisted of l679 bits and was meant to be translated to a rectangular picture with 23 &times; 73 pixels. Since both 23 and 73 are prime numbers, 23 &times; 73 is the unique possible size of the translated rectangular picture each edge of which is longer than l pixel. Of course, there was no guarantee that the receivers would try to translate the message to a rectangular picture. Even if they would, they might put the pixels into the rectangle incorrectly. The senders of the Arecibo message were optimistic.</p>

<p>We are planning a similar project. Your task in the project is to find the most suitable width and height of the translated rectangular picture. The term ``most suitable&#39;&#39; is defined as follows. An integer m greater than 4 is given. A positive fraction&nbsp;<em>a</em>/<em>b</em>&nbsp;less than or equal to 1 is also given. The area of the picture should not be greater than&nbsp;<em>m</em>. Both of the width and the height of the translated picture should be prime numbers. The ratio of the width to the height should not be less than&nbsp;<em>a</em>/<em>b</em>&nbsp;nor greater than 1. You should maximize the area of the picture under these constraints.</p>

<p>In other words, you will receive an integer&nbsp;<em>m</em>&nbsp;and a fraction&nbsp;<em>a</em>/<em>b</em>&nbsp;. It holds that&nbsp;<em>m</em>&nbsp;&gt; 4 and 0 &lt;&nbsp;<em>a</em>/<em>b</em>&nbsp;&le; 1 . You should find the pair of prime numbers&nbsp;<em>p</em>,&nbsp;<em>q</em>&nbsp;such that&nbsp;<em>pq</em>&nbsp;&le;&nbsp;<em>m</em>&nbsp;and&nbsp;<em>a</em>/<em>b</em>&nbsp;&le;&nbsp;<em>p</em>/<em>q</em>&nbsp;&le; 1 , and furthermore, the product&nbsp;<em>pq</em>&nbsp;takes the maximum value among such pairs of two prime numbers. You should report&nbsp;<em>p</em>&nbsp;and&nbsp;<em>q</em>as the &quot;most suitable&quot; width and height of the translated picture.</p>

### 입력

<p>The input is a sequence of at most 2000 triplets of positive integers, delimited by a space character in between. Each line contains a single triplet. The sequence is followed by a triplet of zeros, 0 0 0, which indicates the end of the input and should not be treated as data to be processed.</p>

<p>The integers of each input triplet are the integer&nbsp;<em>m</em>, the numerator&nbsp;<em>a</em>, and the denominator&nbsp;<em>b</em>&nbsp;described above, in this order. You may assume 4 &lt;&nbsp;<em>m</em>&nbsp;&lt; 100000 and 1 &le;&nbsp;<em>a</em>&nbsp;&le;&nbsp;<em>b</em>&nbsp;&le; 1000.</p>

### 출력

<p>The output is a sequence of pairs of positive integers. The&nbsp;<em>i</em>-th output pair corresponds to the&nbsp;<em>i</em>-th input triplet. The integers of each output pair are the width&nbsp;<em>p</em>&nbsp;and the height&nbsp;<em>q</em>&nbsp;described above, in this order.</p>

<p>Each output line contains a single pair. A space character is put between the integers as a delimiter. No other characters should appear in the output.</p>