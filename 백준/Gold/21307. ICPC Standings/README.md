# [Gold V] ICPC Standings - 21307

[문제 링크](https://www.acmicpc.net/problem/21307)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 93, 정답: 28, 맞힌 사람: 25, 정답 비율: 32.468%

### 분류

구현, 시뮬레이션, 정렬

### 문제 설명

<p>ICPC Regional contest results are determined by the final team standings after a regional contest. A regional contest consists of some number of problems that are to be solved by some number of teams.</p>

<p>Teams are ranked according to the most problems solved. Teams who solve the same number of problems are ranked by least <em>total time</em>. The <em>total time</em> is the sum of the <em>time consumed</em> for each problem solved. The time consumed for a solved problem is the time elapsed from the beginning of the contest to the submittal of the first accepted run plus 20 penalty minutes for every previously rejected run for that problem. There is no time consumed for a problem that is not solved. In the event of ties, the team with the smaller <em>time consumed</em> of the last correctly submitted solution ranks higher. That process is repeated as needed (2<sup>nd</sup> to last correctly submitted problem, 3<sup>rd</sup> to last correctly submitted problem, etc.) If there is still a tie after all tie-breakers have been exhausted, the teams are ranked equally and displayed in team number order. For example, if there are 3 teams in a contest, and teams 1 and 3 both rank 1, then team 2 would be rank 3 (there is no rank 2 in this case).</p>

<p>For this problem you will write a program to print the final standings of a contest based on the supplied input.</p>

### 입력

<p>The first line of input contains four space separated integers that define the contest parameters: <em><strong>NT</strong></em> <em><strong>NP</strong></em> <em><strong>NS</strong></em> <em><strong>NR</strong></em> for number of teams, number of problems, number of submissions and number of highest rank to display respectively. (2 &le; <em><strong>NT</strong></em> &le; 100), (1 &le;&nbsp;<em><strong>NP</strong></em> &le; 20), (1 &le; <em><strong>NS</strong></em> &le; 10000), (1 &le; <em><strong>NR</strong></em> &le; <em><strong>NT</strong></em>). Note that it is possible that the highest ranked team(s) actually displayed could be less than <em><strong>NR</strong></em>.</p>

<p>The next <em><strong>NS</strong></em> lines each contain four space separated integers the describe submissions. Each submission line has <em><strong>T</strong></em> <em><strong>P</strong></em> <em><strong>t</strong></em> <em><strong>D</strong></em> for team number, problem number, time submitted and disposition respectively. The time submitted is the number of minutes since the start of the contest. (1 &le;&nbsp;<em><strong>T</strong></em> &le; <em><strong>NT</strong></em>), (1 &le; <em><strong>P</strong></em> &le; <em><strong>NP</strong></em>), (0 &le; <em><strong>t</strong></em> &lt; 300), <em><strong>D</strong></em> = 0 or 1 as to whether the submission rejected (wrong) or accepted (correct) respectively. The value of <em><strong>t</strong></em> will never be less than the previous line&rsquo;s value for <em><strong>t</strong></em>. Any submissions with <em><strong>t</strong></em> &ge;&nbsp;300 should be ignored.</p>

### 출력

<p>The output will consist of the ranked standings (best to worst) for the contest showing all teams with rank 1 through <em><strong>NR</strong></em>. Each line will contain 16 characters grouped in four columns. The first column is the rank left justified in a four-character field. The second column is the team number left justified in a four-character field. The third column is the number of problems solved in a right justified three-character field. The fourth column is the total time right justified in a five-character field.</p>