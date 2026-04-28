# [Bronze II] Amusement Anticipation - 14977

[문제 링크](https://www.acmicpc.net/problem/14977)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 231, 정답: 121, 맞힌 사람: 106, 정답 비율: 57.923%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>It is was late Saturday morning at the end of October. The amusement park was going to be open that afternoon for the first time after months of prolonged reconstruction.</p>

<p>Josse and Murry were sitting in the basement of the office building at the park gate. They have just finished debugging their advanced AI system management of all fantastic attractions in the park. &ldquo;Work is done,&rdquo; said Josse. &ldquo;Now for some amusement. Can you think of any algorithmic problem?&rdquo;</p>

<p>&ldquo;Yes, of course,&rdquo; replied Murry and grinned at his friend from his heavily cluttered desk. &ldquo;Consider, for example, finite sequences of numbers. For me, the most interesting sequences are those that end with a long arithmetic sequence. In other words, I like arithmetic sequences that span from some index to the very last member. As there may be many such subsequences, in order to truly appreciate how interesting some sequence is, it is necessary to determine which one is the longest. Here is your initial sequence. You have to find the start of the longest continuous arithmetic subsequence spanning to its end.&rdquo;</p>

<p>&ldquo;OK,&rdquo; said Josse when he marked the correct place in the sequence. &ldquo;That was easy. What next?&rdquo; &ldquo;What next?&rdquo; Repeated Murry and hesitated for a moment. Then he raised himself determinedly from the chair. &ldquo;Let&rsquo;s go out to the park and find some tougher problems there!&rdquo;</p>

### 입력

<p>There are more test cases. Each case consists of two lines. The first line contains one integer N (1 &le; N &le; 1 000) specifying the length of the sequence. The second line contains a sequence of N integers X<sub>i</sub> (0 &le; X<sub>i</sub> &le; 10<sup>9</sup>), separated by spaces.</p>

### 출력

<p>For each test case, print a single line with the index of the first member of the longest continuous arithmetic subsequence that spans to the end of the given sequence. The index of the first element in the sequence is always 1.</p>