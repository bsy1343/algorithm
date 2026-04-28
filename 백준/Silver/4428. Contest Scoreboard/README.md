# [Silver III] Contest Scoreboard - 4428

[문제 링크](https://www.acmicpc.net/problem/4428)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 96, 정답: 33, 맞힌 사람: 28, 정답 비율: 40.000%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 정렬, 집합과 맵

### 문제 설명

<p>Think the contest score boards are wrong? Here&#39;s your chance to come up with the right rankings.</p>

<p>Contestants are ranked first by the number of problems solved (the more the better), then by decreasing amounts of penalty time. If two or more contestants are tied in both problems solved and penalty time, they are displayed in order of increasing team numbers.</p>

<p>A problem is considered solved by a contestant if any of the submissions for that problem was judged correct. Penalty time is computed as the number of minutes it took for the first correct submission for a problem to be received plus 20 minutes for each incorrect submission received prior to the correct solution. Unsolved problems incur no time penalties.</p>

### 입력

<p>Input consists of a snapshot of the judging queue, containing entries from some or all of contestants 1 through 100 solving problems 1 through 9. Each line of input will consist of three numbers and a letter in the format</p>

<p><var>contestant</var>&nbsp;<var>problem</var>&nbsp;<var>time</var>&nbsp;<var>L</var></p>

<p>where&nbsp;<var>L</var>&nbsp;can be&nbsp;<samp>C</samp>,&nbsp;<samp>I</samp>,&nbsp;<samp>R</samp>,&nbsp;<samp>U</samp>&nbsp;or&nbsp;<samp>E</samp>. These stand for Correct, Incorrect, clarification Request, Unjudged and Erroneous submission. The last three cases do not affect scoring.</p>

<p>Lines of input are in the order in which submissions were received.</p>

### 출력

<p>Output will consist of a scoreboard sorted as previously described. Each line of output will contain a contestant number, the number of problems solved by the contestant and the time penalty accumulated by the contestant. Since not all of contestants 1-100 are actually participating, display only the contestants that have made a submission.</p>