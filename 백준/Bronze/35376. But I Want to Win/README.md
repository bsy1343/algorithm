# [Bronze I] But I Want to Win - 35376

[문제 링크](https://www.acmicpc.net/problem/35376)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 45, 정답: 30, 맞힌 사람: 25, 정답 비율: 71.429%

### 분류

구현, 그리디 알고리즘, 시뮬레이션, 정렬

### 문제 설명

<p>Borphee, the largest city in all of Frobozz, recently lost its mayor to the insatiable appetite of a Grue. The deputy mayor became the interim mayor and immediately took over the mayoral duties, which consist primarily of presiding over the annual <em>Double Fanucci Championships\/</em> (an extraordinarily complex card game) and the <em>From Bad to Worst Songfest\/</em>, which is where the most dreadful singers in the land gather every winter. The mayor's salary is several hundred thousand zorkmids (zm) a year, which is very lucrative for such an easy job. With the special election quickly approaching, it goes without saying that the deputy mayor wants to do anything in his power to change his "interim mayor" status to "mayor" and retain his very generous salary. </p>

<p>The entire empire uses a variation of <em>single-winner ranked choice voting\/</em> for all its elections. It works like this:</p>

<ol>
<li>Voters mark their ballots in order of preference: first choice (their favorite candidate), second choice (their next favorite candidate) and so on. Each voter <strong>must</strong> rank all candidates on their ballot.  For example, if there are 12 candidates in the election, then each voter will rank their choices from 1 (their favorite) to 12 (their least favorite).  The election then proceeds in a set of <em>rounds</em>.</li>
<li>At the start of each round, all first-choice votes are counted. If a candidate receives more than 50\% of the first-choice votes, that candidate wins, and the election is over.</li>
<li>If there is no winner, then the candidate with the least number of first-place votes is removed from all ballots, and the remaining candidates with worse rankings move up. For example, if a voter ranked four candidates in the order A (first-choice) B C D and candidate A is removed, then this voter's ballot is changed to B (new first-choice) C D; if candidate B is removed, then the ballot is changed to A C D. If one or more candidates tie for the least number of first-place votes then all of them are removed from the ballots.</li>
<li>After the ballots are readjusted, return to step 2 to start the next round.</li>
</ol>

<p>This procedure may continue until there are only 2 candidates left, at which point the candidate with the majority of first-place votes wins.</p>

<p>The interim mayor assumes that the election will eventually come down to him and one other very popular candidate as the two front runners. With this in mind, he wants to concentrate his campaigning efforts on the voters who ranked one of the other candidates first on their ballot, in case the initial vote count puts him in 2nd place. To help him better plan, he wants you to develop a program that will allow him to determine the minimum number of rounds (after the first round) that it will take for him to obtain a majority of the votes, assuming he is in 2nd place after round 1.</p>

### 입력

<p>Input starts with a line containing an integer, $c$ ($2 \leq c \leq 20$), which is the number of candidates in the election.  This is followed by a single line containing $c$ distinct integers $v1$, $v2$, \ldots, $vc$, where each $vi$ ($1 \leq vi \leq 10^9$) specifies the number of votes candidate $i$ received.</p>

### 출력

<p>Output consists of a single line. If the second place candidate can not win the election, then output <code>IMPOSSIBLE TO WIN</code>.  Otherwise, output the minimum number of rounds (after the first round) that it will take for the second place candidate to win the election using ranked choice voting.</p>