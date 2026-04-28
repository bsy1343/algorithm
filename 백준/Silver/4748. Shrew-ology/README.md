# [Silver II] Shrew-ology - 4748

[문제 링크](https://www.acmicpc.net/problem/4748)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 15, 맞힌 사람: 15, 정답 비율: 75.000%

### 분류

문자열, 브루트포스 알고리즘, 정렬, 많은 조건 분기

### 문제 설명

<p>Dr. Montgomery Moreau has been observing a population of Northern Madagascar Pie-bald Shrews in the wild for many years. He has made careful observations of all the shrews in the area, noting their distinctive physical characteristics and naming each one.</p>

<p>He has made a list of significant physical characteristics (e.g., brown fur, red eyes, white feet, prominent incisor teeth, etc.) and taken note of which if these appear to be dominant (if either parent has this characteristic, their children will have it) or recessive (the children have this characteristic only if both parents have it).</p>

<p>Unfortunately, his funding from the International Zoological Institute expired and he was forced to leave the area for several months until he could obtain a new grant. During that time a new generation was born and began to mature. Upon returning, Dr. Moreau hopes to resume his work, starting by determining the likely parentage of the each member of the new generation.</p>

### 입력

<p>The first line of input will containing a sequence of 1 to 80 consecutive &rsquo;D&rsquo; and &rsquo;R&rsquo; characters describing a list of physical characteristics, indicating whether each is dominant or recessive.</p>

<p>After this line will follow several lines, each describing a single adult shrew. Each shrew is described by a name of 1-32 non-blank characters terminated by a blank space, then a single M or F character indicating the gender of the animal, another blank space, then a list of consecutive 0 or 1 characters, describing the animal. A 1 indicates that the animal possesses that physical characteristic, a 0 indicates that it does not. The list of adults is terminated by a line containing only the string &ldquo;***&rdquo;.</p>

<p>This is followed by one or more lines describing juvenile animals. These contain a name and description, each formatted identically to those for the adults, separated by a blank space. The list of juveniles is terminated by a line containing only the string &ldquo;***&rdquo;.</p>

### 출력

<p>For each juvenile animal, print a single line consisting of the animal&rsquo;s name, the string &ldquo; by &rdquo;, then a (possibly empty) list of all possible parents for that animal. A set of parents should be printed as the name of the mother, a hyphen, then the name of the father. If the animal has multiple pairs of possible parents, these pairs should be printed in alphabetic (lexicographic) order first by the mother&rsquo;s name, then by the father&rsquo;s name among pairs where the mother is the same. Each pair should be printed separated by the string &ldquo; or &rdquo;.</p>