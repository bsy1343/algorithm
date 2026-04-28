# [Bronze I] Code Cleanups - 16317

[문제 링크](https://www.acmicpc.net/problem/16317)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 243, 정답: 127, 맞힌 사람: 117, 정답 비율: 55.450%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>The management of the software company JunkCode has recently found, much to their surprise and disappointment, that productivity has gone down since they implemented their enhanced set of coding guidelines. The idea was that all developers should make sure that every code change they push to the master branch of their software repository strictly follows the coding guidelines. After all, one of the developers, Perikles, has been doing this since long before these regulations became effective so how hard could it be?</p>

<p>Rather than investing a lot of time figuring out why this degradation in productivity occurred, the line manager suggests that they loosen their requirement: developers can push code that weakly violates the guidelines as long as they run cleanup phases on the code from time to time to make sure the repository is tidy.</p>

<p>She suggests a metric where the &ldquo;dirtiness&rdquo; of a developer&rsquo;s code is the sum of the pushes that violate the guidelines &ndash; so-called dirty pushes &ndash; made by that developer, each weighted by the number of days since it was pushed. The number of days since a dirty push is a step function that increases by one each midnight following the push. Hence, if a developer has made dirty pushes on days 1, 2, and 5, the dirtiness on day 6 is 5 + 4 + 1 = 10. She suggests that a cleanup phase, completely fixing all violations of the coding guidelines, must be completed before the dirtiness reaches 20. One of the developers, Petra, senses that this rule must be obeyed not only because it is a company policy. Breaking it will also result in awkward meetings with a lot of concerned managers who all want to know why she cannot be more like Perikles? Still, she wants to run the cleanup phase as seldomly as possible, and always postpones it until it is absolutely necessary. A cleanup phase is always run at the end of the day and fixes every dirty push done up to and including that day. Since all developers are shuffled to new projects at the start of each year, no dirtiness should be left after midnight at the end of new year&rsquo;s eve.</p>

### 입력

<p>The first line of input contains an integer n (1 &le; n &le; 365), the number of dirty pushes made by Petra during a year. The second line contains n integers d<sub>1</sub>, d<sub>2</sub>, . . . , d<sub>n</sub> (1 &le; d<sub>i</sub> &le; 365 for each 1 &le; i &le; n) giving the days when Petra made dirty pushes. You can assume that d<sub>i</sub> &lt; d<sub>j</sub> for i &lt; j</p>

### 출력

<p>Output the total number of cleanup phases needed for Petra to keep the dirtiness strictly below 20 at all times.</p>