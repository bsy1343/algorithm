# [Silver III] Assessing Genomes - 18054

[문제 링크](https://www.acmicpc.net/problem/18054)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 113, 정답: 74, 맞힌 사람: 62, 정답 비율: 76.543%

### 분류

그리디 알고리즘, 문자열, 정렬

### 문제 설명

<p>The world is at the brink of extinction. A mutated virus threatens to destroy all living organisms. As a last hope, a team of super-smart scientists, including &ndash; of course &ndash; you, is currently working on an antivirus. Unfortunately, your team is unable to analyse the DNA in time. They sequenced n parts of the virus&rsquo; DNA and need to match them with n available strands for antiviruses. As the algorithms expert, you need to implement a specialised procedure to solve this problem. Your approach needs to be fast &ndash; there is not much time left!</p>

<p>You first need to determine the repetition score of each DNA sequence. The repetition score of a sequence s is equal to the length of the shortest sequence u such that s is equal to the k-fold repetition of u, for some positive integer k. For instance, ATGATG has a repetition score of 3, since it can be produced by repeating ATG two times. On the other hand, ATATA has a repetition score of 5, as it cannot be produced from any proper substring.</p>

<p>Once you obtained the scores of all sequences, you need to match the n antivirus sequences with the n virus sequences in a way that minimises the damage caused by the virus. When two sequences are matched, the damage caused by the virus is equal to the squared difference between the two repetition scores. For instance, matching the antivirus sequence ATGATG with the virus sequence ATATA causes (3 &minus; 5)<sup>2</sup> = 4 units of damage.</p>

<p>If you match the DNA sequences optimally, what is the minimal total damage caused by the virus, taken as a sum over all matched pairs?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with an integer n (1 &le; n &le; 50), the number of DNA sequences of the virus and antivirus each.</li>
	<li>n lines, each with a virus DNA sequence.</li>
	<li>n lines, each with an antivirus DNA sequence.</li>
</ul>

<p>Each DNA sequence is a non-empty string with a length of at most 250 and consists of lowercase letters a-z and uppercase letters A-Z.</p>

### 출력

<p>Output one integer, the minimal total damage.</p>