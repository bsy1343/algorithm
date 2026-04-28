# [Platinum V] Spam Filter - 11186

[문제 링크](https://www.acmicpc.net/problem/11186)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 98, 정답: 23, 맞힌 사람: 19, 정답 비율: 31.148%

### 분류

수학, 그리디 알고리즘, 애드 혹, 이분 탐색, 누적 합

### 문제 설명

<p>Goo is working in a well-known Slovak antivirus company which unfortunately cannot be named. In addition to antivirus software, they are developing a spam filter. Recently, Goo has made a few improvements to the filter and he wants to demonstrate his progress to his boss. As you can imagine, demonstrating lowlevel ideas of your implementation is not a good way to impress your boss, so Goo instead decided to make a presentation with plenty of graphs showing filtering results. The company has a huge database of e-mails and each e-mail is marked as a spam or ham (i.e. not spam). These e-mails were all correctly marked by people &ndash; every time someone in the company receives an e-mail, he marks it as either spam or ham and adds it to the database.</p>

<p>The success of Goo&rsquo;s program can be measured in a simple way. Goo ran his program on all e-mails in the database. For each message he noted if his program correctly decided whether the message was spam or ham. The messages were processed in order from the oldest to the newest one. To impress the boss, Goo wants to select e-mails from a period of time and calculate the success rate only for this period. Of course, a period containing only one e-mail won&rsquo;t impress anyone, so Goo wants to choose a period which is long enough.</p>

<p>You are given a sequence of test results and a number k. Your task is to find a continuous subsequence of length at least k which has the highest possible success rate among all such subsequences. The success rate of a subsequence is defined as the number of successfully classified e-mails divided by the length of the subsequence.</p>

### 입력

<p>On the first line there is an integer k (1 &le; k &le; 100) denoting the minimal subsequence length. The second line contains a string consisting of characters 0 and 1, denoting answers of the program for each e-mail in the database. Number 1 indicates that Goo&rsquo;s program gave a correct answer and 0 that it failed. The length of the string will be at least k and at most 100 000 characters.</p>

### 출력

<p>The first and only line of output should consist of two integers f and ℓ, separated by a single space. The integer f is the 1-based index of the first element of subsequence with the best success rate and ℓ is its length. If there are multiple optimal solutions, you can output any one of them.</p>