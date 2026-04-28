# [Platinum II] The Jury is out - 9223

[문제 링크](https://www.acmicpc.net/problem/9223)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 3, 정답 비율: 27.273%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In most Western judicial systems that allow for trial by jury, the jury is selected from a panel of citizens chosen randomly from the electoral roll. However, both the prosecutor and the counsel for the defence have the right to veto any potential jury member that they think could be inimical to their case. This usually means that the resulting jury is fairly bland &mdash; typically white, male, Protestant, middle class and boring. It also means that potential jury members who have strong views, but who could possibly contribute meaningfully to the discussion, are rejected, precisely for that reason.</p>

<p>A better way to select a jury would be to determine in some way, preferably reasonably scientifically, each jury member&rsquo;s value to both the prosecution and defence. We can then define the balance of a person to be the difference between these two quantities and their value to be their sum. With these attributes we can attempt to choose a jury that is as balanced as possible, i.e. one for which the sum of the balances is as small as possible. If more than one selection is as balanced, then we will choose the one that contributes the most value, i.e. the sum of all the values is as large as possible. For example, consider choosing a jury of size 2 from the following panel of 4 &mdash; (20, 1), (1, 20), (10, 9), (10, 9). If we choose the first two we have a total balance of 0, whereas choosing the last 2 would give us a total balance of 2. If the last person was (9, 10), then choosing the last 2 would also give us a total balance of 0, but the value would be less (38 against 42), so we would still choose the first 2.</p>

<p>Write a program that will determine the best (i.e. most balanced) jury of a given size from a panel of potential members. If there is more than one such jury, then choose the one with the greatest total value. If there are still more than one then report any of them.</p>

### 입력

<p>Input will be a series of jury panels. Each panel will start with an integer k, (5 &le; k &le; 20) on a line by itself, where k is the size of the jury to be chosen. This will be followed by no more than 100 lines, each containing two integers (in the range 1 through 20 inclusive) representing the value of that potential juror to the prosecution and defence respectively. These lines are implicitly numbered from 1 upwards and these numbers serve to identify the person. The list will be terminated by a line containing two zeroes (0, 0). The file will be terminated by a line containing a single zero (0).</p>

### 출력

<p>Output will be series of pairs of lines, one pair for each jury panel. The first line in each pair identifies the jury and specifies the jury number (a running number starting at 1), the balance achieved and the value. Follow the example shown in the sample output. The next line contains, in order, a list of k integers representing the selected jury, separated by single spaces. Separate successive juries by a blank line.</p>