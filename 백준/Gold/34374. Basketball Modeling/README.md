# [Gold II] Basketball Modeling - 34374

[문제 링크](https://www.acmicpc.net/problem/34374)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

기댓값의 선형성, 다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>It's the start of another exciting season for Mines' women's basketball team! After crunching all of the data from previous seasons, student data scientists at Mines have identified a model that accurately predicts how many points the team will score in a game. Unfortunately, the model is rather complicated, and they need your help to crunch the numbers!</p>

<p>Throughout the course of a game, the team will have a positive number of discrete possessions. During each possession, the team will do one of three things: attempt a $2$-point shot, attempt a $3$-point shot, or make no shot attempt. On every possession, the team will attempt a $2$-point shot with a probability of $A_2$ percent, and a $3$-point shot with a probability of $A_3$ percent. Given that the team attempts a $2$-point shot on their $i^{\text{th}}$ possession, they have a probability of $M_{2, i}$ percent that the shot is successful, scoring two points for the possession. Similarly, given that the team attempts a $3$-point shot on their $i^{\text{th}}$ possession, they have a probability of $M_{3, i}$ percent that the shot is successful, scoring three points for the possession. If either type of shot attempt is unsuccessful, or no shot is attempted during a possession, it results in zero points scored for that possession. A possession ends after a shot has been made, missed, or if no shot was attempted.</p>

<p>The shot probabilities for the first possession, $M_{2, 1}$ and $M_{3, 1}$ are known. However, after missing or making a shot, the team's confidence in their ability to make that same type of shot on the next possession changes, which influences the probability of them making that shot.</p>

<p>Specifically, the team has known confidence adjustments $C_2$ and $C_3$. If they attempt a $2$-point shot on their $i^{\text{th}}$ possession and make it, then $M_{2, i + 1} = \min(M_{2, i} + C_2, 100)$ (they cannot have more than a $100$ percent chance of making a shot, of course). If they however miss the shot, then $M_{2, i + 1} = \max(M_{2, i} - C_2, 0)$ (they similarly cannot have less than a zero percent chance of making a shot). Similarly, if they attempt a $3$-point shot on their $i^{\text{th}}$ possession and make it, then $M_{3, i + 1} = \min(M_{3, i} + C_3, 100)$, but if they miss it, then $M_{3, i + 1} = \max(M_{3, i} - C_3, 0)$.</p>

<p>If the team does not attempt a $2$-point shot on their $i^{\text{th}}$ possession, then the shot probability for the $2$-point shot remains unchanged for the next possession ($M_{2, i + 1} = M_{2, i}$). Similarly, if the team does not attempt a $3$-point shot on their $i^{\text{th}}$ possession, the shot probability of the $3$-point shot remains unchanged for the next possession ($M_{3, i + 1} = M_{3, i}$). If no shot is attempted during a possession, then neither shot type has been attempted, and both shot probabilities remain the same for the next possession.</p>

<p>What is the expected number of points that the team will score in total across all $N$ possessions that they will have during a game? The expected number of points is the weighted average of the number of points that the team will score in total across all $N$ possessions.</p>

### 입력

<p>The first line of input contains a single integer $1 \leq N \leq 100$, the number of possessions that the team will have during a game.</p>

<p>The second line of input contains two space-separated integers, $0 \leq A_2 \leq 100$, and $0 \leq A_3 \leq 100$, the percent probabilities that the team attempts a $2$-point and $3$-point shot, respectively. Note that $0 \leq A_2 + A_3 \leq 100$.</p>

<p>The third line of input contains two space-separated integers, $0 \leq M_{2, 1} \leq 100$, and $0 \leq M_{3, 1} \leq 100$, the percent probabilities that the team makes a $2$-point or $3$-point shot on their first possession, respectively.</p>

<p>The fourth and final line of input contains two space-separated integers, $0 \leq C_2 \leq 100$, and $0 \leq C_3 \leq 100$, the confidence adjustments for the $2$-point and $3$-point shots, respectively, whose definitions are provided above.</p>

### 출력

<p>Your output should be a single line, containing a single real number, the expected number of points that the team will score over the $N$ possessions. Your answer should have an absolute or relative error of at most $10^{-6}$.</p>

### 힌트

<p>In the first sample, there is a single possession. The expected number of points scored in that possession is $2 \cdot \frac{50}{100} \cdot \frac{40}{100} + 3 \cdot \frac{30}{100} \cdot \frac{20}{100} = 0.58$</p>