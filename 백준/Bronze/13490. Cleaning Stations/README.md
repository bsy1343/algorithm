# [Bronze I] Cleaning Stations - 13490

[문제 링크](https://www.acmicpc.net/problem/13490)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 93, 정답: 64, 맞힌 사람: 55, 정답 비율: 77.465%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Among the many interesting symbiotic relationships between marine animals are &ldquo;cleaning stations.&rdquo; Those are locations&nbsp;like sea mounts where larger numbers of cleaner fish tend to hang out. Large fish &mdash; such as sharks &mdash; will swim up to&nbsp;a cleaning station and look for one or more cleaner fish to help clean them of parasites. The cleaner fish get to eat the&nbsp;parasites off the shark&rsquo;s skin (thus earning a meal), while the shark gets cleaned. Both profit. (Wouldn&rsquo;t it be nice if we&nbsp;had cleaning stations like this for our C++ and Java code?)</p>

<p>Sharks feel extremely vulnerable when being cleaned, and are very picky about which specific fish they allow to clean&nbsp;them. If anything seems off, they will often make a hasty retreat. (They have good reason: some cleaner fish occasionally&nbsp;take little bites out of the shark in addition to eating the parasites; those cleaner fish are sometimes ostracized by other&nbsp;cleaner fish, so they don&rsquo;t bring the entire cleaning station into disrepute.) We assume that there are a number of features&nbsp;that matter in finding the right cleaner fish. For each feature, there is a positive or negative weight that the shark ascribes&nbsp;to this feature. For instance, the shark may prefer larger cleaner fish, but a smaller distance to swim there, and for the&nbsp;cleaner fish to swim more slowly. For each cleaner fish, you will be given its value for each feature. You are to then list&nbsp;the best cleaner fish(es) for the given shark, meaning those maximizing the weighted sum of feature values.</p>

### 입력

<p>The first line is the number K of input data sets, followed by K data sets, each of the following form:</p>

<p>The first line contains two integers n, m. 1 &le; n &le; 100 is the number of cleaner fish, and 1 &le; m &le; 10 is the number of&nbsp;features sharks use to judge cleaner fish.</p>

<p>The next line contains m integer numbers x<sub>1</sub>, x<sub>2</sub>,...,x<sub>m</sub> between &minus;20 and +20. These are the weights that the shark&nbsp;ascribes to the m features.</p>

<p>Next come n lines, one per cleaner fish. Each such line contains m integer numbers y<sub>i,1</sub>, y<sub>i,2</sub>,...,y<sub>i,m</sub>, giving the feature&nbsp;values for the ith cleaner fish. Each y<sub>i,j</sub> will be an integer between &minus;20 and +20.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p>Then, in ascending order, one per line, output all the cleaner fish that achieve the highest weighted score for the shark.</p>

<p>Each data set should be followed by a blank line.</p>