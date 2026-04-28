# [Gold IV] Segment Pricing - 5146

[문제 링크](https://www.acmicpc.net/problem/5146)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 12, 맞힌 사람: 10, 정답 비율: 31.250%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Ok, so now we know how to compute our fares once they&rsquo;re posted. But how do these fares actually get decided? There are actually a lot of important factors in these decisions, such as simplicity of fare structure, fairness, revenue maximization, and the fact that in many places (including LA), the fares really are only a tiny fraction of the budget. Nevertheless, it is interesting how we should price the individual segments of a subway line to maximize profit, assuming full knowledge about the ridership on the line and their exact budget.</p>

<p>Here is a simple model for this. The subway line has n stops, and thus n&minus;1 segments between those stops. For simplicity, let&rsquo;s say that everyone wants to go to stop n, but they get on at different stops. We want to assign a fare for each starting point i. Of course, for fairness, the fare for stop i cannot be less than that for stop i + 1, since it&rsquo;s a longer distance. But whether, or how much, it is more is up to us. For each stop, we are also given an exact list of all riders j and their budgets b<sub>j</sub> . They will only get on the subway if b<sub>j</sub> is at least as much as the fare; otherwise, they&rsquo;ll walk. Finally, the city prohibits us from making any fare more than \$5.00. Our goal is now to find the maximum revenue that can be obtained by choosing the fares carefully within the constraints. You can assume that the subway always has enough seats to accommodate everyone.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains an integer 2 &le; n &le; 100, the number of stops of the subway.</p>

<p>This is followed by n &minus; 1 lines, with line i describing the passengers getting on at stop i (remember that they all get off at stop n). This line consists of some number 0 &le; m<sub>i</sub> &le; 100 of integers b<sub>j</sub> &ge; 0. b<sub>j</sub> is the budget (in cents) of the jth passenger at stop i. The budgets will be sorted in non-decreasing order.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the maximum revenue (in cents) that can be accomplished by choosing the fares carefully. Each data set should be followed by a blank line.</p>