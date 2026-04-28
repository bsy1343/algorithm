# [Gold II] Picnic Planning - 7362

[문제 링크](https://www.acmicpc.net/problem/7362)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 121, 정답: 5, 맞힌 사람: 5, 정답 비율: 5.435%

### 분류

브루트포스 알고리즘, 그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>￼The Contortion Brothers are a famous set of circus clowns, known worldwide for their incredible ability to cram an unlimited number of themselves into even the smallest vehicle. During the off-season, the brothers like to get together for an Annual Contortionists Meeting at a local park. However, the brothers are not only tight with regard to cramped quarters, but with money as well, so they try to find the way to get everyone to the party which minimizes the number of miles put on everyone&#39;s cars (thus saving gas, wear and tear, etc.). To this end they are willing to cram themselves into as few cars as necessary to minimize the total number of miles put on all their cars together. This often results in many brothers driving to one brother&#39;s house, leaving all but one car there and piling into the remaining one. There is a constraint at the park, however: the parking lot at the picnic site can only hold a limited number of cars, so that must be factored into the overall miserly calculation. Also, due to an entrance fee to the park, once any brother&#39;s car arrives at the park it is there to stay; he will not drop off his passengers and then leave to pick up other brothers. Now for your average circus clan, solving this problem is a challenge, so it is left to you to write a program to solve their milage minimization problem.</p>

### 입력

<p>The input begins with a single positive integer on a line by itself indicating the number of the cases following, each of them as described below. This line is followed by a blank line, and there is also a blank line between two consecutive inputs.</p>

<p>Each case will consist of one problem instance. The first line will contain a single integer n indicating the number of highway connections between brothers or between brothers and the park. The next n lines will contain one connection per line, of the form name1 name2 dist, where name1 and name2 are either the names of two brothers or the word Park and a brother&#39;s name (in either order), and dist is the integer distance between them. These roads will all be 2-way roads, and dist will always be positive. The maximum number of brothers will be 20 and the maximumlength of any name will be 10 characters. Following these n lines will be one final line containing an integer s which specifies the number of cars which can fit in the parking lot of the picnic site. You may assume that there is a path from every brother&#39;s house to the park and that a solution exists for each problem instance.</p>

### 출력

<p>For each test case, the output must follow the description below. The outputs of two consecutive cases will be separated by a blank line.</p>

<p>For each test case, the output should consist of one line of the form</p>

<p>Total miles driven: xxx</p>

<p>where xxx is the total number of miles driven by all the brothers&#39; cars.</p>