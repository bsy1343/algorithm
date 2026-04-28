# [Gold II] Pear-wise Voting - 16868

[문제 링크](https://www.acmicpc.net/problem/16868)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 11, 정답 비율: 78.571%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>Bob Roberts is ending his term as president of a local group of fruit aficionados call the Pear-wise Club. Being president is a plum position so many people are running, some of whom Bob thinks are just peachy, while others are just the pits. After some thought, Bob has amended the by-laws of the Pear-wise Club to use sequential pairwise voting to determine his successor.</p>

<p>Sequential pairwise voting works as follows: every voter presents a ballot which ranks the candidates from most to least favorable. Then two of the candidates are selected to hold a one-on-one contest with these ballots, using the relative positions of the candidates on each ballot to determine how each voter would vote in this contest. The winner of this contest then takes part in a second one-on-one contest with a third candidate; the winner of that takes part in a third contest with a fourth candidate, and so on. The winner of the election is the winner of the last one-on-one contest.</p>

<p>The order in which the candidates take part in the one-on-one contests is specified by the agenda, which is a pre-selected ordering of the candidates. The first two candidates on the agenda take part in the first contest; the winner of that contest then faces the third candidate on the agenda, an so on. For example, assume we had the following set of 13 ballots, each ranking five candidates A, B, C, D and E:</p>

<pre style="text-align: center;">
(4) (3) (3) (2) (1)
A   D   C   B   E
D   C   A   D   B
C   A   D   C   C
B   B   B   A   D
E   E   E   E   A</pre>

<p>The number above each ballot indicates the number of voters who submitted that ballot. If the agenda is ABCDE, then sequential pairwise voting would proceed as follows: in the first contest between A and B, A wins 10&ndash;3; A would then face C (the third candidate on the agenda) and here C wins 9&ndash;4; C would then face D and D wins 9&ndash;4; and finally D would face E and D would win 12&ndash;1, so D would be the overall winner using this agenda. Using the reverse agenda &ndash; EDCBA &ndash; would result in A winning the election (we&rsquo;ll let you figure out the details of that one).</p>

<p>Now it wasn&rsquo;t out of any political science reasons that Bob picked sequential pairwise voting, or the coincidence of its name. He knows that the results are highly dependent on the agenda that&rsquo;s used and as current president, Bob gets to set the agenda! Since he&rsquo;s also aware of everyone&rsquo;s voting preferences, he&rsquo;s pretty sure that he can find an agenda so that his preference for who succeeds him will be elected. Just to be sure, he would like you to write a program which, when given a set of ballots as input, determines, for each candidate, whether there is an agenda which will result in his/her winning the election.</p>

### 입력

<p>Input begins with a line containing two positive integers n m (n &le; 26, m &le; 2 000) indicating the number of candidates and the number of unique ballots, respectively. Candidates are labeled with the first n letters of the alphabet, uppercase. Each of the next m lines displays one of the m ballots. Each line starts with a positive integer p (p &le; 100) indicating the number of voters who submitted the ballot, following by a string of n characters specifying the ballot. This upper-case string is a permutation of the first n characters of the English alphabet, with the first character in the string indicating the most favored candidate in the ballot, the second character the second-most favored, and so on. The total number of votes over all ballots will be odd, so there can&rsquo;t be a tie in any pairwise vote.</p>

### 출력

<p>For each candidate display the candidate&rsquo;s letter followed by a colon, followed by either the phrase <code>can win</code> if an agenda exists where the candidate can win, or the phrase <code>can&#39;t</code> win if no such agenda exists.</p>