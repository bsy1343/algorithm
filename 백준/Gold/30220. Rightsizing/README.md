# [Gold III] Rightsizing - 30220

[문제 링크](https://www.acmicpc.net/problem/30220)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 18, 맞힌 사람: 15, 정답 비율: 83.333%

### 분류

자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Many tech companies have realized that they have &ldquo;over-hired.&rdquo; Now, looking at their books, they realize they might have to let go of some employees. In order to prioritize their bottom line, a company will always fire the employee who is making the greatest annual salary at the time. If multiple employees are making the same maximal annual salary, then the person whose name comes first alphabetically will be fired.</p>

<p>Of course, to improve morale, employees can still get raises, which makes figuring out who to fire a bit more tricky.</p>

<p>Given a set of employees and their initial annual salaries, followed by a sequence of actions (either the firing of an employee or giving a raise to a current employee), determine for each firing event, which employee got fired.</p>

### 입력

<p>The first input line contains two integers: n (1 &le; n &le; 10<sup>5</sup>) representing the number of employees in the company, and a (1 &le; a &le; 2 &times; 10<sup>5</sup>) representing the number of actions taken.</p>

<p>The next n input lines will each contain a string, e, representing an employee&#39;s name, followed by an integer, s (1 &le; s &le; 10<sup>9</sup>), representing employee e&#39;s annual salary in dollars. These n lines represent the initial status of the company&#39;s employees and their salaries. Each name will be a unique string and will contain 1-20 lowercase letters (starting in column 1).</p>

<p>The next a input lines will each contain information about an action.</p>

<p>If the first integer on one of these input lines is 1, that means that an employee is getting a raise. This will be followed by a string e, representing the employee getting the raise and an integer, r (1 &le; r &le; 10<sup>9</sup>), representing the raise amount for employee e. It is guaranteed that each employee getting a raise was listed in the original input and has not been fired yet.</p>

<p>If the first integer on one of these lines is 2, that means the company is firing the employee making the maximum salary. If there is more than one such person, then the person getting fired is the one whose name comes first alphabetically. Since there are n employees, assume that the maximum number of times action 2 will appear in the input is n.</p>

### 출력

<p>For each firing event (action 2 in the input), print a single line with the name of the employee who got fired and how much they were making annually at the time they were fired, separated by a space.</p>