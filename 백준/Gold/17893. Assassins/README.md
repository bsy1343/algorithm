# [Gold I] Assassins - 17893

[문제 링크](https://www.acmicpc.net/problem/17893)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 19, 맞힌 사람: 17, 정답 비율: 41.463%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>In the cut-throat world of assassins for hire, the rivalry is ruthless and everyone is fighting to get an edge. To eliminate the competition, many assassins even go so far as to assassinate other assassins. The question is: with several assassins trying to do each other in, which ones will remain alive and kicking, and which ones will kick the bucket?</p>

<p>Assassins generally lay careful plans before executing them, including planning multiple attempts to dispose of the same target, with the second attempt being a backup in case the first attempt fails, the third attempt being a secondary backup, and so on. Using their great annihilytical skills, assassins can also very accurately determine the probability that any given assassination attempt will succeed.</p>

<p>Given the list of planned assassination attempts for a group of assassins, what are the probabilities that each assassin is alive after all these attempts? Performing an assassination attempt requires that the assassin is still alive, so if the assassin is indisposed due to already having been assassinated, the attempt is cancelled.</p>

### 입력

<p>The first line of input contains two integers n and m, where n (1 &le; n &le; 15) is the number of assassins, and m (0 &le; m &le; 1000) is the number of planned assassination attempts. The assassins are numbered from 1 to n.</p>

<p>Then follow m lines, each containing two integers i, j, and a real number p, indicating that assassin i plans to attempt to assassinate assassin j (1 &le; i, j &le; n, j &ne;&nbsp;i), and that this attempt would succeed with probability p (0 &le; p &le; 1, at most 6 digits after the decimal point). The planned attempts are listed in chronological order from first to last, and no two attempts happen simultaneously.</p>

### 출력

<p>Output n lines, with the i&rsquo;th containing the probability that assassin i is alive after all m assassination attempts have taken place. You may assume that none of the n assassins will die of any other cause than being assassinated in one of these m attempts. The probababilities should be accurate to an absolute error of at most 10<sup>&minus;6</sup>.</p>