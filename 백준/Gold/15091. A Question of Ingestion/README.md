# [Gold IV] A Question of Ingestion - 15091

[문제 링크](https://www.acmicpc.net/problem/15091)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 129, 정답: 38, 맞힌 사람: 33, 정답 비율: 33.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Stan Ford is a typical college graduate student, meaning that one of the most important things on his mind is where his next meal will be. Fortune has smiled on him as he&rsquo;s been invited to a multi-course barbecue put on by some of the corporate sponsors of his research team, where each course lasts exactly one hour. Stan is a bit of an analytical type and has determined that his eating pattern over a set of consecutive hours is always very consistent. In the first hour, he can eat up to m calories (where m depends on factors such as stress, bio-rhythms, position of the planets, etc.), but that amount goes down by a factor of two-thirds each consecutive hour afterwards (always truncating in cases of fractions of a calorie). However, if he stops eating for one hour, the next hour he can eat at the same rate as he did before he stopped. So, for example, if m = 900 and he ate for five consecutive hours, the most he could eat each of those hours would be 900, 600, 400, 266 and 177 calories, respectively. If, however, he didn&rsquo;t eat in the third hour, he could then eat 900, 600, 0, 600 and 400 calories in each of those hours. Furthermore, if Stan can refrain from eating for two hours, then the hour after that he&rsquo;s capable of eating m calories again. In the example above, if Stan didn&rsquo;t eat during the third and fourth hours, then he could consume 900, 600, 0, 0 and 900 calories.</p>

<p>Stan is waiting to hear what will be served each hour of the barbecue as he realizes that the menu will determine when and how often he should refrain from eating. For example, if the barbecue lasts 5 hours and the courses served each hour have calories 800, 700, 400, 300, 200 then the best strategy when m = 900 is to eat every hour for a total consumption of 800 + 600 + 400 + 266 + 177 = 2 243 calories. If however, the third course is reduced from 400 calories to 40 calories (some low-calorie celery dish), then the best strategy is to not eat during the third hour &mdash; this results in a total consumption of 1 900 calories.</p>

<p>The prospect of all this upcoming food has got Stan so frazzled he can&rsquo;t think straight. Given the number of courses and the number of calories for each course, can you determine the maximum amount of calories Stan can eat?</p>

### 입력

<p>Input starts with a line containing two positive integers n m (n &le; 100, m &le; 20 000) indicating the number of courses and the number of calories Stan can eat in the first hour, respectively. The next line contains n positive integers indicating the number of calories for each course.</p>

### 출력

<p>Display the maximum number of calories Stan can consume.</p>