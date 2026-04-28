# [Gold I] The Fox and the Owl - 11458

[문제 링크](https://www.acmicpc.net/problem/11458)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 83, 정답: 25, 맞힌 사람: 22, 정답 비율: 32.836%

### 분류

많은 조건 분기, 그리디 알고리즘

### 문제 설명

<p>Fox Mithra has finally learned the numbers and he is now familiar with the concept of &lsquo;one&rsquo;, &rsquo;two&rsquo;, &lsquo;three&rsquo; and also even &lsquo;zero&rsquo;, &lsquo;minus one&rsquo;, &lsquo;minus two&rsquo; and so on. Really, an achievement for such a small fox. He took the textbook and copied the integers from the book one by one from the smallest to the biggest on the wall of his enclosure in the ZOO.</p>

<p>&ldquo;Look, there is something wrong with your sequence on the wall&rdquo;, said the owl who just landed on the branch above Mithra&rsquo;s head. &ldquo;You should put 30 between 20 and 22, there.&rdquo;</p>

<p>&ldquo;Why?&rdquo;</p>

<p>&ldquo;Because the importance of a number is judged by the sum of its digits. 30 is therefore less important than 22 and it is more important than 20. And obviously, 30 should be equally close to 20 and 22 because its sum of digits differs only by one from both 20 and 22.&rdquo;</p>

<p>&ldquo;I see,&rdquo; replied Mithra, &ldquo;you are really clever. Can you help me please to rearrange the sequence correctly? Each time I tell you a number N you will tell me the closest smaller number with sum of digits bigger by one than the sum of digits of N.&rdquo;</p>

<p>&ldquo;With pleasure,&rdquo; nodded the owl majestically.</p>

<p>Your task is to imitate the owl&rsquo;s task. Given an integer N you have to find the biggest integer which is smaller than N with sum of digits bigger by one than the sum of digits of N.</p>

### 입력

<p>There are more test cases. Each case consists of one line containing a single integer N (|N| &le; 10<sup>100 000</sup>). The input is terminated by a line containing string &ldquo;END&rdquo; and no other symbols.</p>

### 출력

<p>For each test case print on a separate line the number demanded by fox Mithra.</p>