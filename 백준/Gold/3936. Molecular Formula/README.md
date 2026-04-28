# [Gold I] Molecular Formula - 3936

[문제 링크](https://www.acmicpc.net/problem/3936)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 29, 맞힌 사람: 26, 정답 비율: 66.667%

### 분류

자료 구조, 해싱, 구현, 파싱, 재귀, 스택, 문자열, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Your mission in this problem is to write a computer program that manipulates molecular formulae in virtual chemistry. As in real chemistry, each molecular formula represents a molecule consisting of one or more atoms. However, it may not have chemical reality.</p>

<p>The following are the definitions of atomic symbols and molecular formulae you should consider.</p>

<ul>
	<li>An atom in a molecule is represented by an atomic symbol, which is either a single capital letter or a capital letter followed by a small letter. For instance <code>H</code> and <code>He</code> are atomic symbols.</li>
	<li>A molecular formula is a non-empty sequence of atomic symbols. For instance, <code>HHHeHHHe</code> is a molecular formula, and represents a molecule consisting of four <code>H</code>&rsquo;s and two <code>He</code>&rsquo;s.</li>
	<li>For convenience, a repetition of the same sub-formula \(\overbrace { X...X }^{ n } \) where n is an integer between 2 and 99 inclusive, can be abbreviated to (X)n. Parentheses can be omitted if X is an atomic symbol. For instance, <code>HHHeHHHe</code> is also written as <code>H2HeH2He</code>, <code>(HHHe)2</code>, <code>(H2He)2</code>, or even <code>((H)2He)2</code>.</li>
</ul>

<p>The set of all molecular formulae can be viewed as a formal language. Summarizing the above description, the syntax of molecular formulae is defined as follows.</p>

<pre>
     Molecule &rarr; Atom | Atom Number | ( Molecule ) Number | Molecule Molecule
         Atom &rarr; CapitalLetter | CapitalLetter SmallLetter
       Number &rarr; 2 | 3 | 4 | &middot; &middot; &middot; | 97 | 98 | 99
CapitalLetter &rarr; A | B | C | &middot; &middot; &middot; | X | Y | Z
  SmallLetter &rarr; a | b | c | &middot; &middot; &middot; | x | y | z</pre>

<p>Each atom in our virtual chemistry has its own atomic weight. Given the weights of atoms, your program should calculate the weight of a molecule represented by a molecular formula. The molecular weight is defined by the sum of the weights of the constituent atoms. For instance, assuming that the atomic weights of the atoms whose symbols are <code>H</code> and <code>He</code> are 1 and 4, respectively, the total weight of a molecule represented by <code>(H2He)2</code> is 12.</p>

### 입력

<p>The input consists of two parts. The first part, the Atomic Table, is composed of a number of lines, each line including an atomic symbol, one or more spaces, and its atomic weight which is a positive integer no more than 1000. No two lines include the same atomic symbol.</p>

<p>The first part ends with a line containing only the string <code>END_OF_FIRST_PART</code>.</p>

<p>The second part of the input is a sequence of lines. Each line is a molecular formula, not exceeding 80 characters, and contains no spaces. A molecule contains at most 10<sup>5</sup> atoms. Some atomic symbols in a molecular formula may not appear in the Atomic Table.</p>

<p>The sequence is followed by a line containing a single zero, indicating the end of the input.</p>

### 출력

<p>The output is a sequence of lines, one for each line of the second part of the input. Each line contains either an integer, the molecular weight for a given molecular formula in the corresponding input line if all its atomic symbols appear in the Atomic Table, or <code>UNKNOWN</code> otherwise. No extra characters are allowed.</p>