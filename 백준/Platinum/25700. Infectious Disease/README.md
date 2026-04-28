# [Platinum II] Infectious Disease - 25700

[문제 링크](https://www.acmicpc.net/problem/25700)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 44.444%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 조합론, 확률론, 모듈로 곱셈 역원, 기댓값의 선형성

### 문제 설명

<p>In the year of 2202, a strange disease begins to spread in a city of $n$ people.</p>

<p>To prevent the disease from spreading, experts invented a strong vaccine called Mysterious Oscar. On day $0$, one citizen is infected by the disease, and another citizen is vaccinated. If a person becomes vaccinated, he/she will be cured immediately and will not catch or spread the disease anymore.</p>

<p>On each subsequent day $d$ ($d&gt;0$), the infected citizens will infect others one by one. Each of the citizens who were infected strictly before day $d$ will choose one uninfected and unvaccinated citizen to infect equiprobably. If at some point, one infected citizen has no unvaccinated and uninfected citizens to choose from, then he/she will do nothing.</p>

<p>After infection, the vaccinated citizens will persuade others to take the vaccine one by one. Each of the citizens who were vaccinated strictly before day $d$ will choose $2$ different unvaccinated citizens equiprobably, and persuade them so that they become vaccinated. If at some point, one vaccinated citizen has less than $2$ unvaccinated citizens to choose, then he/she will persuade all the remaining unvaccinated citizens to take the vaccine.</p>

<p>Grammy wants to know how many days will pass before the disease will be fully extinguished. Please tell her the expected number of days before all patients become cured.</p>

<p>It can be shown that the answer can be expressed as an irreducible fraction $\frac{x}{y}$, where $x$ and $y$ are integers and $y \not \equiv 0 \pmod {10^9+7}$. Output the integer equal to $x\cdot y^{-1}\pmod {10^9 + 7}$. In other words, output such an integer $a$ that $0\leq a &lt; 10^9 + 7$ and $a\cdot y\equiv x\pmod {10^9+7}$.</p>

### 입력

<p>The only line contains an integer $n$ ($2 \leq n \leq 1.4 \cdot 10^7$), denoting the population of the city.</p>

### 출력

<p>Output a single integer, denoting the expected number of days before all patients become cured modulo $10^9+7$.</p>

### 힌트

<p>In the first sample, one citizen took the vaccine on day $0$, and he/she persuaded the other citizen, the only patient, to take the vaccine on day $1$, so the disease must be completely cured on day $1$.</p>