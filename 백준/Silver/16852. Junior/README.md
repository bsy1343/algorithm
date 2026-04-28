# [Silver II] Junior - 16852

[문제 링크](https://www.acmicpc.net/problem/16852)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>In many cultures, children share their last name with at least one of their parents. In addition, in quite a few families, children will also be given a middle name to honor an ancestor, often a grandparent or parent. And in some cases, parents go even further, and name a child after their own first name. Most often, this is firstborn sons named after their father, and in that case, the word &ldquo;junior&rdquo; is often appended to the name to distinguish them. In this problem, you will use these naming conventions to determine how many families seem to be contained in a data set.</p>

<p>You will be given a list of names. Each name is a string containing only lowercase letters and whitespace (which separates parts of the name). Names consist of a first name (always), a middle name (optional), a last name (always), and one of the words &ldquo;junior&rdquo; or &ldquo;iii&rdquo; (optional). No one will ever have a first, middle, or last name of &ldquo;junior&rdquo; or &ldquo;iii&rdquo;. You can infer that person A is the child of person B if (1) person A was born after person B, and (2) one of the following happens:</p>

<ul>
	<li>Person A has the exact same name as person B, but with &ldquo;junior&rdquo; appended.</li>
	<li>Person A has the same name as person B, but with &ldquo;junior&rdquo; replaced with &ldquo;iii&rdquo;. (That is, B&rsquo;s name ends in &ldquo;junior&rdquo;, and A&rsquo;s in &ldquo;iii&rdquo;, but apart from that replacement, their names are exactly the same.)</li>
	<li>A and B have the same last name, and the middle name of A is the first name of B, and A does not have any &ldquo;junior&rdquo; or &ldquo;iii&rdquo; appended to his name.</li>
</ul>

<p>The number of families in your data set is the number of people for whom you cannot find a potential parent in the data set. (Notice that this means that if you have two &ldquo;fitzgerald kennedy&rdquo; and one &ldquo;john fitzgerald kennedy&rdquo;, it doesn&rsquo;t matter that you cannot figure out which family he belongs with.)</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains a single integer 1 &le; n &le; 1000, the number of people in your data set. This is followed by n lines, each containing a string of length at most 80 characters, consisting only of lower-case letters and whitespace. The names will be given in increasing order of when the people were born.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the number of families represented in the data set, i.e., the number of people whose parent is not known to be in the data set.</p>

<p>Each data set should be followed by a blank line.</p>