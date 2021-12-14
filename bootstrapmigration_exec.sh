find . -name '*.html' | while read file; do
	while IFS=, read -r old new; do
		sed -i "s/$old/$new/g" $file
	done < bootstrapmigration_classnames.csv
done
