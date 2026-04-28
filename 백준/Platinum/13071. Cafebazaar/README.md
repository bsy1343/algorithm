# [Platinum I] Cafebazaar - 13071

[문제 링크](https://www.acmicpc.net/problem/13071)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 10, 맞힌 사람: 9, 정답 비율: 45.000%

### 분류

서큘레이션, 최대 유량, 최소 비용 최대 유량, 그래프 이론

### 문제 설명

<p>You are working as the product manager of Cafebazaar, a well-known Iranian Android marketplace. As your one-year plan, you have a list of applications to develop for which you need to assign proper developers. There are n developers in Cafebazaar, some of which are full-time, and the others are part-time developers. Your have m applications in your list, some of which are business-critical and the others are ordinary applications.</p>

<p>Of course, developers have different skills. Some developers are professional in developing some applications, while they are incapable of developing the other applications. If developer i is capable of developing application j, then you will gain x<sub>i,j</sub> amount of payoff by assigning her to that application in your plan. Obviously, a developer cannot be assigned to an application that she is not capable to develop. To gain maximum time and cost&nbsp;efficiency, you would like to assign each developer to at most one application, and assign at most one developer to each application. A development plan is proper if it has the following two properties: (i) all full-time developers are involved in the plan, so they will not get disappointed, and (ii) all critical applications are covered, hence you will not lose clients. In other words, a development plan is proper if each full-time developer is assigned to exactly one application, and exactly one developer is assigned to each critical application. Note that in a proper plan, you may also assign part-time developers to applications, or assign developers to ordinary applications. Your goal is to find a proper plan that yields a maximum amount of payoff.</p>

### 입력

<p>There are multiple test cases in the input. Each test case starts with a line containing two space-separated integers n and m (1 &le; n, m &le; 100), representing the number of developers and applications, respectively. The next line starts with an integer t (0 &le; t &le; n), the number of full-time developers, followed by t numbers, each of which is the index of a full-time developer. Developers are indexed from 1 to n. The next line starts with an integer s (0 &le; s &le; m), the number of critical applications, followed by s numbers, each of which is the index of a critical application. Applications are indexed from 1 to m. The next n lines, one for each developer, contain the following information. The i-th line (1 &le; i &le; n) starts with an integer d<sub>i</sub> (0 &le; d<sub>i</sub> &le; m), the number of applications that developer i is capable to develop, followed by d<sub>i</sub> pairs of integers a<sub>i,j</sub> and x<sub>i,j</sub> (1 &le; j &le; d<sub>i</sub>, 1 &le; a<sub>i,j</sub> &le; m, 1 &le; x<sub>i,j</sub> &le; 10<sup>6</sup>), where a<sub>i,j</sub> is the index of an application that developer i is capable to develop, and x<sub>i,j</sub> is the payoff achieved if application a<sub>i,j</sub> is developed by developer i. Note that each a<sub>i,j</sub> as the index of an applicaton appears at most once in this list of a developer. The input terminates with a line containing 0 0 which should not be processed.</p>

### 출력

<p>You should output one line for each test case, containing the maximum payoff you can obtain by a proper plan. If there is no proper plan, you must output &minus;1 in one line.</p>