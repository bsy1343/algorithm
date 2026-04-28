# [Platinum V] Fixing the Bugs - 5047

[문제 링크](https://www.acmicpc.net/problem/5047)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A certain big IT company which we will not name in order not to get sued, are preparing to launch a new version of their flagship product. Having just been employed as a developer on the project, you have been given a list of open bugs that should be fixed in the new version.</p>

<p>Being bugs, you are not exactly certain how to fix them, even though you have some ideas. For each bug you are able to estimate your ability to quickly fix the bug. Of course, these estimates may be wrong, so if you try to fix a bug and fail, you will revise the estimate of your ability to fix this bug.</p>

<p>To be specific, we use the following probabilistic model for the bug fixing process: for each bug, there is an associated fix probability p. Every hour, you choose one bug to work on, and work on this bug for the entire hour (if you manage to fix the bug in less then an hour, you celebrate by having coffee and taunting your coworkers for the remaining part of the hour). The probability that you succeed in fixing the bug during this hour is p. If you fail to resolve the bug, the fix probability for this bug is reduced to p &middot; f , where f &le; 1 is a factor indicating how much faith you lose in your ability after a failure. The fix probabilities for the other bugs remain unchanged. The next hour, you again choose an open bug to work on, and so on. This is repeated until the new version is released, and you are allowed to go home and sleep.</p>

<p>In addition, each bug has a severity s indicating how severe the bug is (or alternatively, the value of fixing the bug). Clearly, it is possible that you will not manage to fix all the bugs before the product is released. In order to make as good an impression on your boss as possible, you would like to maximize the total severity of those bugs which you do manage to resolve, by carefully choosing which bugs to work on. What will be the expected value of the total severity of fixed bugs, provided that you, every hour, choose which bug to work on in such a way that this quantity is maximized?</p>

### 입력

<p>The first line of input contains three numbers B, T and f, where 0 &le; B &le; 10 is an integer giving the number of open bugs, 0 &le; T &le; 100 is an integer giving the number of hours left until the new version is released, and 0 &le; f &le; 1 is a real number as described above.</p>

<p>Each of the following B lines describe an open bug. Each such description contains two numbers p and s, where 0 &le; p &le; 1 is a real number giving the initial fix probability of the bug and 0 &le; s &le; 10 000 is an integer giving the severity of the bug.</p>

### 출력

<p>Output a line containing the expected total severity of bugs fixed, provided you work in a way which maximizes this quantity. Any answer with either absolute or relative error smaller than 10<sup>&minus;6</sup> is acceptable.</p>