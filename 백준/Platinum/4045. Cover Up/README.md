# [Platinum IV] Cover Up - 4045

[문제 링크](https://www.acmicpc.net/problem/4045)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 7, 맞힌 사람: 6, 정답 비율: 46.154%

### 분류

백트래킹, 조합론, 다이나믹 프로그래밍, 게임 이론, 구현, 수학, 확률론, 재귀, 시뮬레이션

### 문제 설명

<p>&ldquo;The Price is Right&rdquo; is a popular game show where contestants play various games to win fabulous prizes. One of the games played on the show is called &ldquo;Cover Up&rdquo; whose object is to guess a 5-digit number (actually, the price of a new car). In the actual game, contestants are given two numbers to choose from for the first digit, three numbers to choose from for the second digit, and so on. A contestant selects one number for each digit (from the set of yet unpicked numbers for that digit) and then is told which ones are correct; if at least one is correct, the player is allowed to guess again for all incorrect digits. The contestant keeps guessing as long as they keep getting at least one new digit correct. The game ends when either all the digits are correct (a win for the contestant) or after a turn when no new digit is guessed correctly (a loss).</p>

<p>Typically this game is not sheer luck. For example, suppose you had the following five possibilities for the last digit: 1, 3, 5, 8 and 9. Many car prices end with either a 5 or a 9, so you might have, say, a 70% chance that one of these two numbers is correct; this breaks down to a 35% chance for either the 5 or the 9 and a 10% chance for each of the other three digits. Now say you pick the 5 and it&rsquo;s wrong, but some other guess you made was right so you still get to play. With this additional information the probabilities for the remaining 4 numbers change: the probability for the 9 is now close to around 54%, while each of the other three numbers now has a little over a 15% chance. (We&rsquo;ll let you figure out how we got these values). We&rsquo;ll call the 5 and the 9 in the original group the known candidates, and typically there are known candidates in other columns as well. For example, if the two numbers for the first (high order) digit are 1 and 9, the contestant can be 100% sure that the 1 is the correct digit (there aren&rsquo;t too many \$90,000 cars to be given away).</p>

<p>For this problem, you are to determine the probability of winning the game if an optimal strategy for picking the numbers (based on probabilities such as those described above) is used.</p>

### 입력

<p>Each test case will consist of two lines. The first will be n, the number of digits in the number to be guessed. The maximum value of n will be 5. The second line will contain n triplets of numbers of the form m l p where m is the number of choices for a digit, l is the number of known candidates, and p is the probability that one of the known candidates is correct. In all cases 0 &le; l &lt; m &le; 10 and 0.0 &le; p &le; 1.0. Whenever l = 0 (i.e., when there are no known candidates) p will always be 0.0. A line containing a single 0 will terminate the input.</p>

### 출력

<p>Output for each test case is the probability of winning using optimal strategy. All probabilities should be rounded to the nearest thousandth, and trailing 0&rsquo;s should not be output. (A 100% chance of winning should be output as 1.)</p>