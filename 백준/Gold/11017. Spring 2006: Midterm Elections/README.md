# [Gold V] Spring 2006: Midterm Elections - 11017

[문제 링크](https://www.acmicpc.net/problem/11017)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 32, 정답: 22, 맞힌 사람: 17, 정답 비율: 94.444%

### 분류

그리디 알고리즘, 많은 조건 분기

### 문제 설명

<p>In Spring of 2006, it was time for midterm elections, so the contest was titled the &ldquo;Midterm Elections Contest&rdquo;, and we explored some computational aspects thereof. One of the topics we looked at were the famous &ldquo;butterfly ballots&rdquo;. Butterfly ballots are a tried and true way to ensure that many voters will accidentally vote for the wrong candidate. In a butterfly ballot, all the candidates&rsquo; names are on one side (say, the left), while all the boxes in which to mark a vote are on the other side. Now, if the boxes are a little bit shifted, it can be hard to tell which box corresponds to which candidate. For instance, look at the following ballot:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11017.%E2%80%85Spring%E2%80%852006%3A%E2%80%85Midterm%E2%80%85Elections/fe7266b2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11017/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:226px; width:602px" /></p>

<p>You&rsquo;ll have to admit that if one isn&rsquo;t careful with this ballot, one might easily end up making a mark next to UCLA instead of USC. Of course, similar things could happen to political candidates.</p>

<p>You are to write a program to design a ballot that will make your candidate win, if possible. The assumption is that all candidates must be on the ballot, in some order from top to bottom that you can determine. The boxes will be on the other side, so that the first box is above the first candidate, the second box between the first and second candidate, and so forth. The assumption is then that among the voters who intend to vote for candidate i, half will actually vote for i, and half will accidentally vote for candidate i + 1. Of course, among the voters who intend to vote for the last candidate on the ballot, all will vote correctly. You are to decide if your candidate can be made to win the election. (If your candidate is tied for first place, we also consider that a win.)</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains a number n with 1 &le; n &le; 100, the number of candidates on the ballot. Candidate 1 is the one you are trying to make win. This is followed by n lines, each containing a number 1 &le; v<sub>i</sub> &le; 1, 000, 000, the number of voters who intend to vote for candidate i. All the vi will be even numbers, so you don&rsquo;t need to worry about what happens about division by 2.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. If it is possible for candidate 1 to win, then output &ldquo;Possible&rdquo; on a line by itself, otherwise output &ldquo;Impossible&rdquo;.</p>

<p>Each data set should be followed by a blank line.</p>