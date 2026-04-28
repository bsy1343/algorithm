# [Silver I] Test Taking - 6037

[문제 링크](https://www.acmicpc.net/problem/6037)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 17, 맞힌 사람: 15, 정답 비율: 39.474%

### 분류

수학, 정렬

### 문제 설명

<p>Farmer John has to take his annual farming license test. The test comprises N (1 &lt;= N &lt;= 1,000,000) true/false questions. After FJ&#39;s dismal performance on last year&#39;s test Bessie wishes to help him.</p>

<p>Bessie has inside information that the number of questions whose answer is true will be one of t_1, t_2, t_3,..., or t_K (0 &lt;= t_i &lt;= N; 0 &lt;= K &lt;= 10,000) -- even though Bessie has no information about any answer to any specific question. Bessie wants to know the best score that FJ is guaranteed achieve by exploiting this information carefully, even if he doesn&#39;t know the actual answers to any test questions.</p>

<p>To demonstrate Bessie&#39;s idea, consider a license test with N=6 questions where Bessie knows that the number of questions with the answer &#39;true&#39; is either 0 or 3. FJ can always get at least 3 answers correct using logic like this: If FJ answers &#39;false&#39; on every question and there are 0 questions with the answer &#39;true&#39; then he will get all 6 correct. If there are 3 questions with the answer &#39;true&#39; then he will get 3 answers correct. So as long as he marks every answer as &#39;false&#39; he is guaranteed to get at least 3 correct without knowing any answer to the test questions.</p>

<p>On the other hand, consider what happens if FJ chooses an inferior strategy: he guesses that some 3 answers are &#39;true&#39; and the other 3 are &#39;false&#39;. If it turns out that NO answers are &#39;true&#39; then FJ will get 3 answers correct, the ones he guessed were false. If 3 answers are &#39;true&#39; then FJ could get as few as 0 answers correct. If he answered incorrectly on all 3 of that answers for which he guessed &#39;true&#39;, and the other 3 (for which he guessed &#39;false&#39;) are true, then he gets 0 correct answers. Even though FJ could get 3 correct in this case by guessing &#39;false&#39; every time, he can not always guarantee even 1 correct by guessing some 3 answers as &#39;true&#39;, so this strategy can not guarantee getting any answer correct. FJ should use the previous paragraph&#39;s strategy.</p>

<p>Given Bessie&#39;s inside information, determine the number of answers FJ can always get correct using this information assuming he uses it optimally.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and K</li>
	<li>Lines 2..K+1: Line i+1 contains a single integer: t_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer, the best score FJ is guaranteed to achieve</li>
</ul>

<p>&nbsp;</p>