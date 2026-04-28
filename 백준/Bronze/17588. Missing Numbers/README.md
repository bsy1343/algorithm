# [Bronze III] Missing Numbers - 17588

[문제 링크](https://www.acmicpc.net/problem/17588)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 839, 정답: 613, 맞힌 사람: 562, 정답 비율: 72.892%

### 분류

구현

### 문제 설명

<p>You enjoy your new job as a teacher of young children. It&rsquo;s fun to see them learning to count, recognize letters, draw, and interact with the world.</p>

<p>One common problem you&rsquo;ve noticed is that children often forget numbers when counting. For example, early on they might count &ldquo;one, two, three, five, six.&rdquo; You have to remind them about that &ldquo;four&rdquo; that they didn&rsquo;t say. And as they get more proficient and clever, they may use the &ldquo;quick&rdquo; way of counting: &ldquo;one, two, skip a few, ninety-nine, one hundred!&rdquo;</p>

<p>Please write a program that can help you (and your students) identify the missing numbers when they are counting.</p>

### 입력

<p>The first line of input contains a single integer <em>n</em>, where 1 &le; <em>n</em> &le; 100. Each of the next <em>n</em> lines contains one number that the child recited. Each recited number is an integer between 1 and 200 (inclusive). They are listed in increasing order, and there are no duplicates.</p>

### 출력

<p>If the child recited all the numbers between 1 and the last number they recited, then print <code>good job</code>.</p>

<p>If the child missed any numbers between 1 and the last number they recited, then print those missing numbers in increasing numeric order, one per line.</p>