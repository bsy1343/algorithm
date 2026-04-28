# [Silver I] Retribution! - 17852

[문제 링크](https://www.acmicpc.net/problem/17852)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 29, 맞힌 사람: 24, 정답 비율: 50.000%

### 분류

정렬

### 문제 설명

<p>The coaches in a certain regional are fed up with the judges. During the last contest over 90% of the teams failed to solve a single problem&mdash;in fact, even half the judges found the problems too hard to solve. So the coaches have decided to tar and feather the judges. They know the locations of all the judges as well as the locations of tar repositories and feather storehouses. They would like to assign one repository and one storehouse to each judge so as to minimize the total distances involved. But this is a hard problem and the coaches don&rsquo;t have time to solve it (the judges are evil but not stupid&mdash;they have a sense of the unrest they&rsquo;ve fomented and are getting ready to leave town). So instead they&rsquo;ve decided to use a greedy solution. They&rsquo;ll look for the smallest distance between any tar repository and any judge location and assign that repository to that judge. Then they&rsquo;ll repeat the process with the remaining repositories and judges until all the judges have a repository assigned to them. After they&rsquo;re finished with the tar assignments they&rsquo;ll do the same with the feather storehouses and the judges. Your job is to determine the total distances between repositories and storehouses and their assigned judges.</p>

<p>All judges, tar repositories and feather storehouses are numbered 1, 2, . . .. In case of any ties, always assign a repository/storehouse to the lowest numbered judge first. If there is still a tie, use the lowest numbered repository/storehouse.</p>

<p>Better hurry up&mdash;an unmarked van has just been spotted pulling up behind the judges&rsquo; room.</p>

### 입력

<p>Input starts with a line containing three positive integers: n m p (1 &le; n &le; m, p &le; 1 000), representing the number of judges, tar repositories and feather storehouses, respectively. Following this are n lines, each containing two integers x y (|x|, |y| &le; 10 000) specifying the locations of the n judges, starting with judge 1. This is followed by m similar lines specifying the locations of the tar repositories (starting with repository 1) and p lines specifying the locations of the feather storehouses (starting with storehouse 1).</p>

### 출력

<p>Output the the sum of all distances between judges and their assigned tar repositories and feather storehouses, using the greedy method described above. Your answer should have an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>