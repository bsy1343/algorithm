# [Gold III] Football - 11072

[문제 링크](https://www.acmicpc.net/problem/11072)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 35, 정답: 17, 맞힌 사람: 17, 정답 비율: 65.385%

### 분류

다이나믹 프로그래밍, 문자열, 파싱

### 문제 설명

<p>I turned the TV on the other day and a football game (Rugby League) was being broadcast. The score was 26 to 17 and I wondered how the game had progressed and which ways the teams had scored and the order of those scoring plays to get to their current scores. After some quick back of the envelope calculations I worked out that there were 4 507 705 365 837 803 005 ways that the game could have progressed to get to the current score.</p>

<p>Each code of football has different ways of scoring. In soccer, the teams can only score one point at a time. In some codes different ways of scoring are worth the same number of points e.g. in Rugby Union a drop goal and a penalty goal are both worth 3 points but are different modes of scoring. In many games a team can score points for a particular play and can then attempt to score bonus points of differing values. For example, in American football (gridiron), a team can score a touchdown worth 6 points and can then attempt either a 1 point (kick) conversion or 2 point (pass or run) conversion. In this way a team could score a touchdown followed by an unsuccessful conversion for 6 points, or a touchdown followed by a successful conversion for 7 or 8 points depending on the option taken.</p>

<p>In football (soccer) there is only one way of scoring i.e. with a 1 point goal. A 1-1 draw can be achieved in two ways. The score could have progressed from 0-0 to 0-1 to 1-1 or from 0-0 to 1-0 to 1-1. This different ordering of team scoring also needs to be taken into consideration.</p>

<p>From the different ways points can be scored for a particular game, write a program to work out the number of ways, including different orders of plays, the teams could have reached their current scores. As the number of ways is likely to be large report the results modulo 1 000 000 009.</p>

### 입력

<p>The input contains a single test case.</p>

<p>The first line contains two integers a and b specifying the scores of the two teams, 0 &le; a, b &le; 200. All scores will be attainable using the permitted means of scoring.</p>

<p>The second line contains a series of groups of integers, which may comprise base score values and bonus score values, signifying the different scoring options for the game being played. Each of the groups of integers are separated by a single space. Base score values (0 &lt; si &le; 20) will be listed in non-descending order. There will be at least one base score value and no more than 20 base score values in a test case.</p>

<p>When bonus points can be scored for a particular play the bonus score values are separated from the base score value by a colon e.g. for American football 6:1:2. Bonus score values for a base score value, (0 &lt; b<sub>j</sub> &lt; s<sub>i</sub>), will also be listed in ascending order.</p>

### 출력

<p>Output for each test case consists of a single line as specified in the example. The word &ldquo;way&rdquo; should be pluralised when there are multiple ways that the scoreline could be achieved.</p>