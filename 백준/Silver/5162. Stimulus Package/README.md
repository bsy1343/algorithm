# [Silver I] Stimulus Package - 5162

[문제 링크](https://www.acmicpc.net/problem/5162)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 14, 맞힌 사람: 13, 정답 비율: 92.857%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>In an attempt to mitigate the impacts of the economic crisis, the US Government has passed a massive stimulus package. The idea is that since other investors are shying away from spending money (partly due to lack of money, partly due to fear), the government should invest in worthwhile causes which will create jobs at the same time, thus helping the economy recover. Of course, this leads to a big decision of which projects are worthy. There are several variables of importance here: how many jobs are created, how much the project costs, and how much permanent infrastructure or knowledge is created. For job creation, there is also the consideration that some projects generate jobs immediately (e.g., building a bridge), while others might generate jobs in the future (e.g., computer science research). Thus, there is a complicated tradeoff. (And we haven&rsquo;t even talked about geographic balance yet.)</p>

<p>In this problem, you are to write a program to find in a sense the &ldquo;best&rdquo; selection of projects to fund. For each project i, you will be given its cost c<sub>i</sub>, infrastructure gain g<sub>i</sub>, and job creation for the next Y years j<sub>i,1</sub>,j<sub>i,2</sub>,... ,j<sub>i,Y</sub> . You are also given a total budget B, and job creation targets J<sub>1</sub>,J<sub>2</sub>,... ,J<sub>Y</sub>. You are to find out if there is a selection of projects that will meet all job creation requirements without exceeding the budget. If there is such a selection, you are to output the maximum total infrastructure gain of any such selection.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of each data set contains three integers n,Y,B. n &le; 20 is the total number of projects you are considering, 1 &le; Y &le; 50 is the number of years you are looking into the future, and 0 &le; B &le; 1000000000 is your total budget.</p>

<p>This is followed by one line with Y integers, containing the job creation targets J<sub>1</sub>,... ,J<sub>Y</sub> . Finally, there are n lines, each containing Y + 2 integers. The ith line contains first the job creation numbers j<sub>i,1</sub>,... ,j<sub>i,Y</sub> for the ith project, then the cost of the project, and finally the infrastructure gain g<sub>i</sub> for project i.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output either &ldquo;No selection.&rdquo; (if there is no selection meeting all job creation requirements), or the best total infrastructure gain among all selections that meet the job creation requirements. Each data set should be followed by a blank line.</p>