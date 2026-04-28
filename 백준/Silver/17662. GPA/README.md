# [Silver I] GPA - 17662

[문제 링크](https://www.acmicpc.net/problem/17662)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 12, 맞힌 사람: 11, 정답 비율: 34.375%

### 분류

수학, 구현, 자료 구조, 집합과 맵, 사칙연산, 해시를 사용한 집합과 맵

### 문제 설명

<p>For many students, at graduation, all that matters is one number: the GPA.<sup>3</sup> Except, then, many employers seem to be not so interested in how a CSCI or EE student did in &ldquo;Introduction to Origami;&rdquo; somehow, they seem to care more about performance in CSCI104 or CSCI270 or CSCI360. Strange! As a result, the &ldquo;Major GPA&rdquo; has become a thing, which only includes classes &ldquo;in the major.&rdquo; But if you are double- or triple-majoring, then computing all your multiple major GPAs becomes rather time-consuming. Isn&rsquo;t that what computers are for? In fact, it is &mdash; thanks for pointing this out!</p>

<p>You will be given the complete course catalog of a university (course names and units), as well as the major requirements for each of the majors. Then, you will be given a list of students, and for each student all the classes they have taken and the grades they received. You will output, for each student, the overall GPA, and the GPA for each major such that the student completed all requirements for this major. The GPA is weighted: for each class the student took, you multiply the student&rsquo;s grade (a number between 0.0 and 4.0) by the number of units of the class. In the end, you divide the sum of all these weighted grades by the total number of units the student took. That&rsquo;s the student&rsquo;s GPA. Similarly for the major GPA, except you only sum the classes relevant for the major.</p>

<p><sup>3</sup>Well, ok, there may also be the student debt.</p>

### 입력

<p>The first line contains a number 1 &le; K &le; 100, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains three integers 1 &le; C &le; 10000, 1 &le; M &le; 500, 1 &le; s &le; 1000 (the number of classes, the number of majors, and the number of students who are graduating).</p>

<p>This is followed by C lines, each describing a class i, by giving its name n<sub>i</sub> and number of units u<sub>i</sub>. The name consists of 2&ndash;4 uppercase letters, followed immediately by exactly 3 digits. The number of units is an integer between 1 and 6, inclusive.</p>

<p>Next come the M majors. The first line of a major j contains first a string of 2&ndash;4 uppercase letters (the name of the major), and then the number r<sub>j</sub> &ge; 1 of classes the major requires (an integer). This is followed by r<sub>j</sub> lines, each containing exactly one class name. The class name will be a legal name from the first C lines. The total number of units of any major will add up to at most 128.</p>

<p>Finally, we have the s students. For each student k, you first get the integer t<sub>k</sub> &ge; 1 of classes the student has taken. This is followed by t<sub>k</sub> lines, each containing first the name of a class (a legal string from the first C lines), followed by the student&rsquo;s grade in the class, a floating point number between 0.0 and 4.0. No student ever takes more than 200 units total. And no student will ever take the same class twice.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the overall GPA and all applicable major GPAs, for each student, in the order the majors were listed in the input file. Specifically, first print a line &ldquo;Student k&rdquo;, where k is the student&rsquo;s number. Then print a line with the student&rsquo;s GPA. Then, for each major for which the student took all required classes, print the name of the major, followed by the student&rsquo;s GPA in that major. (See below for the format.) All GPAs should be rounded to two decimals. Each data set should be followed by a blank line.</p>