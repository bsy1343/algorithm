# [Bronze I] Average is not Fast Enough! - 6558

[문제 링크](https://www.acmicpc.net/problem/6558)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 142, 정답: 67, 맞힌 사람: 61, 정답 비율: 48.031%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>A relay is a race for two or more teams of runners. Each member of a team runs one section of the race. Your task is to help to evaluate the results of a relay race.</p>

<p>You have to process several teams. For each team you are given a list with the running times for every section of the race. You are to compute the average time per kilometer over the whole distance. That&#39;s easy, isn&#39;t it?</p>

<p>So if you like the fun and challenge competing at this contest, perhaps you like a relay race, too. Students from Ulm participated e.g. at the &quot;SOLA&quot; relay in Zurich, Switzerland. For more information visit http://www.sola.asvz.ethz.ch/ after the contest is over.</p>

### 입력

<p>The first line of the input specifies the number of sections <em>n</em> followed by the total distance of the relay <em>d</em> in kilometers. You may safely assume that <em>1&lt;=n&lt;=20</em> and <em>0.0&lt;d&lt;200.0</em>. Every following line gives information about one team: the team number <em>t</em> (an integer, right-justified in a field of width 3) is followed by the <em>n</em> results for each section, separated by a single space. These running times are given in the format <code>&quot;h:mm:ss&quot;</code> with integer numbers for the hours, minutes and seconds, respectively. In the special case of a runner being disqualified, the running time will be denoted by <code>&quot;-:--:--&quot;</code>. Finally, the data on every line is terminated by a <em>newline</em> character. Input is terminated by EOF.</p>

### 출력

<p>For each team output exactly one line giving the team&#39;s number <em>t</em> right aligned in a field of width 3, and the average time for this team rounded to whole seconds in the format <code>&quot;m:ss&quot;</code>. If at least one of the team&#39;s runners has been disqualified, output <code>&quot;-&quot;</code> instead. Adhere to the sample output for the exact format of presentation.</p>