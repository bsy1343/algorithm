# [Silver V] Campus Buildings - 5210

[문제 링크](https://www.acmicpc.net/problem/5210)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 245, 정답: 119, 맞힌 사람: 107, 정답 비율: 55.729%

### 분류

구현, 문자열

### 문제 설명

<p>Most campuses have a lot of named buildings, and as the names tend to be rather long, the class schedules have abbreviations. At USC, it seems that the abbreviations have become used so widely that most people don&rsquo;t even remember the full name of the building. SAL, PHE, OHE. To a newcomer, this can be quite confusing. So perhaps, we ought to write a little program that finds out which building could be meant by abbreviations.</p>

<p>Here&rsquo;s how we&rsquo;ll do it: you will be given a list of building names, and a building abbreviation, such as SAL or FRSSC. The abbreviation matches the building name if all of its letters appear, in this order, in the building name (no letter can be matched twice). So, for instance, SAL matches &ldquo;SALvatori&rdquo;, or &ldquo;Student Aerospace Laboratory&rdquo;, or &ldquo;univerSity of southern cALifornia&rdquo;. It does not match &ldquo;angeles&rdquo;, as the letters are in the wrong order. For the comparison, we will ignore case, so &lsquo;S&rsquo; and &lsquo;s&rsquo; are the same letter.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains the number n of buildings, 1 &le; n &le; 100. This is followed by n lines, each containing the name of a building, consisting of only uppercase and lowercase letters and white space. Finally, the building code will follow on a line by itself.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output all of the building names that match the building code, each on its own line, and in the order in which they appeared in the initial list.</p>